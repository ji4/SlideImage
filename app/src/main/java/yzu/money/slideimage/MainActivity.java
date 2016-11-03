package yzu.money.slideimage;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LinearLayout ll;
    private TextView tv;
    private ViewPager vp;
    private ArrayList<ImageView> ivs = new ArrayList<>();
    int [] ids={R.drawable.s1, R.drawable.s2, R.drawable.s3};
    String[] str = {"soeasy", "very easy", "super easy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll= (LinearLayout) findViewById(R.id.activity_main);
        tv=new TextView(this);
        tv.setTextSize(40);
        ll.addView(tv);
        vp=new ViewPager(this);
        for(int i=0; i<ids.length; i++)
        {
            ImageView iv=new ImageView(this);
            iv.setBackgroundResource(ids[i]);
            ivs.add(iv);
        }
        vp.setAdapter(new ViewPagerAdapter(ivs));
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                tv.setText(str[position]);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        ll.addView(vp);
    }
    //-----------------------
    public class ViewPagerAdapter extends PagerAdapter{
        private List<ImageView> list;

        public ViewPagerAdapter(List<ImageView> ivs) {//Constructor
            this.list = ivs;//list改成ivs
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
            //super.destroyItem(container, position, object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view=list.get(position);
            container.addView(view);
            return view;
            //return super.instantiateItem(container, position);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }
    }
}

