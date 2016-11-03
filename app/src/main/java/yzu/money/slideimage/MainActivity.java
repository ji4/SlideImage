package yzu.money.slideimage;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private LinearLayout ll;
    private TextView tv;
    private ViewPager vp;
    private ArrayList<ImageView> ivs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll= (LinearLayout) findViewById(R.id.activity_main);
        tv=new TextView(this);
        tv.setTextSize(40);
        ll.addView(tv);
        vp=new ViewPager(this);
        vp.setAdapter(new ViewPagerAdapter());
        ll.addView(vp);
    }
    //-----------------------
    public class ViewPagerAdapter extends PagerAdapter{


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return false;
        }
    }
}

