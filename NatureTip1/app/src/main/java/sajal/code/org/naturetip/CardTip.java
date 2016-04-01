package sajal.code.org.naturetip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class CardTip extends AppCompatActivity {

    private CardView cardView;
    private TextView titleView, tipView;
    //    private GetSet getSet;
    private ImageView imageView;
    private Animation cardAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_tip);

        cardView = (CardView) findViewById(R.id.cardView);
        titleView = (TextView) findViewById(R.id.textView);
        tipView = (TextView) findViewById(R.id.textView2);
        imageView = (ImageView) findViewById(R.id.imageView);

        if (SaveState.SAVE == 1) {
        titleView.setText(SaveState.TITLE);
        tipView.setText(SaveState.TIP);
        imageView.setImageResource(SaveState.ID);

        }else {
            titleView.setText("You have already viewed today,s tip.");
            tipView.setText("Wait for next tip ,follow the NatureTip and be happy. ");
            imageView.setImageResource(R.drawable.maple_leaf);

        }

        cardAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.card_animation);
        cardView.startAnimation(cardAnimation);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
