package sajal.code.org.naturetip;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

/**
 * Created by Sajal Tyagi on 17-03-2016.
 */
public class AlertService extends BroadcastReceiver {

    int N_ID = 12;
    int random;
    public static GetSet getSet;

    private DailyTips dailyTips;
    int[] arr = {R.mipmap.greentech
            , R.mipmap.logo,
            R.mipmap.recycling,
            R.mipmap.reuse, R.mipmap.reuse_one,
            R.mipmap.user_groups, R.mipmap.vegan_clothing};

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("TIME", "RECIEVER");
        createTip(context);

    }

    private void createTip(Context context) {
        dailyTips = new DailyTips();
        random = (int) (Math.random() * arr.length);

        Intent intent = new Intent(context, CardTip.class);
        getSet = new GetSet();
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), arr[random]);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle("Your Tip For Today!!! ->");

        getSet.setTitle("Your Tip For Today!!! ->");
        getSet.setId(arr[random]);
        getSet.setTip(dailyTips.myTips());

        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        builder.addAction(R.drawable.ic_action_accept, "READ", pendingIntent);
        builder.setColor(Color.CYAN);
        builder.setContentText("You should do this.");
        builder.setSmallIcon(R.mipmap.greentech);
        builder.setLargeIcon(bitmap);
//        builder.setVisibility(NotificationCompat.VISIBILITY_PUBLIC);

        NotificationCompat.InboxStyle bigTextStyle =
                new NotificationCompat.InboxStyle();

        bigTextStyle.setBigContentTitle("Your Tip For Today ->");
        bigTextStyle.addLine("You should follow this to save the environment.");
        builder.setStyle(bigTextStyle);
//        builder.setSmallIcon(R.drawable.unnamed);

        builder.setDefaults(NotificationCompat.DEFAULT_SOUND);
        builder.setAutoCancel(true);

        SaveState.SAVE = 1;
        SaveState.ID = AlertService.getSet.getId();
        SaveState.TIP = AlertService.getSet.getTip();
        SaveState.TITLE = AlertService.getSet.getTitle();
        Notification notification = builder.build();
        NotificationManagerCompat.from(context).notify(N_ID, notification);
    }
}
