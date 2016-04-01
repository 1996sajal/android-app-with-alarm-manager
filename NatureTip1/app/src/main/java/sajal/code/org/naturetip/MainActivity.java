package sajal.code.org.naturetip;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private Button button, credits;
    private int appHour, appMinute;
    private PendingIntent pendingIntent;
    private NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        credits = (Button) findViewById(R.id.button3);

        timePicker.setIs24HourView(true);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                appHour = hour;
                appMinute = minute;
                Log.d("TIME", "" + appHour + ":" + appMinute);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "You will be notified everyday at :" +
                                appHour + ":" + appMinute, 500).show();
                Calendar calendar = Calendar.getInstance();
                calendar.get(Calendar.AM_PM);
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(Calendar.HOUR_OF_DAY, appHour);
                calendar.set(Calendar.MINUTE, appMinute);

                Log.d("TIME", "Calendar" + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE));

                Intent intent = new Intent(getApplicationContext(), AlertService.class);

                AlarmManager alarmManager = (AlarmManager) getApplicationContext()
                        .getSystemService(Context.ALARM_SERVICE);

                pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),
                        0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 60000, pendingIntent);
            }
        });

        credits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Credits.class));
            }
        });

    }
}
