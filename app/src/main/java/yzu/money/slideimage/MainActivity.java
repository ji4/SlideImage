package yzu.money.slideimage;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private LinearLayout ll;
    private TextView tv;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll= (LinearLayout) findViewById(R.id.activity_main);
        tv=new TextView(this);
        tv.setTextSize(40);
        ll.addView(tv);
        vp=new ViewPager(this);
        ll.addView(vp);
    }
}
