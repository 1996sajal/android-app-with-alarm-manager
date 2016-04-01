package sajal.code.org.naturetip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by Sajal Tyagi on 20-03-2016.
 */
public class Credits extends AppCompatActivity {

    private Animation animation;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
        textView = (TextView) findViewById(R.id.credits);
        textView.setText("CREDITS:\n" + "\nDeveloper : Sajal Tyagi\n\tAkhila Mehani\nNealansh Arora\n" +
                "\nContent : Akhila Mehani\n\tNealansh Arora\n\tRitvika Paruthi\n\t" +
                "\nConcept : Puneet Kataria\n" + "\nDesign : Sajal Tyagi\n\tRashi Gupta\n\tDivi Oberoi\n\tJitesh Gupta");
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mycredits);
        textView.startAnimation(animation);

    }
}
