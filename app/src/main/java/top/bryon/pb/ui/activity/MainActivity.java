package top.bryon.pb.ui.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.bryon.pb.R;
import top.bryon.pb.ui.fragment.CicleFragment;
import top.bryon.pb.ui.fragment.FindFragment;
import top.bryon.pb.ui.fragment.ProfileFragment;
import top.bryon.pb.ui.fragment.SchoolFragment;
import top.bryon.pb.ui.widget.TipLayout;

public class MainActivity extends FragmentActivity {

    @Bind({R.id.tv_school, R.id.tv_cicle, R.id.tv_find, R.id.tv_profie})
    List<TextView> tabs;

    @Bind(R.id.viewPager)
    ViewPager viewPager;



    int[][] resIds = {{R.drawable.ic_school_general, R.drawable.ic_school},
            {R.drawable.ic_circle_general, R.drawable.ic_circle},
            {R.drawable.ic_find_general, R.drawable.ic_find},
            {R.drawable.ic_person_general, R.drawable.ic_person}};


    private int currentItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        viewPager.setAdapter(new MainPagerAdaper(getSupportFragmentManager(), this));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        setCurrentItem(currentItem);
    }

    public void setCurrentItem(int index) {
        TextView textView = tabs.get(currentItem);
        textView.setTextColor(getResources().getColor(R.color.blue_gray));
        Drawable drawable = getResources().getDrawable(resIds[currentItem][0]);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        textView.setCompoundDrawables(null, drawable, null, null);

        currentItem = index;

        TextView currenttextView = tabs.get(currentItem);
        currenttextView.setTextColor(getResources().getColor(R.color.green_light));
        Drawable currentdrawable = getResources().getDrawable(resIds[currentItem][1]);
        currentdrawable.setBounds(0, 0, currentdrawable.getMinimumWidth(), currentdrawable.getMinimumHeight());
        currenttextView.setCompoundDrawables(null, currentdrawable, null, null);
    }

    @OnClick({R.id.tv_school, R.id.tv_cicle, R.id.tv_find, R.id.tv_profie})
    public void onClick(View view) {
        int index = -1;
        for (int i = 0; i < tabs.size(); i++) {
            if (view.getId() == tabs.get(i).getId()) {
                index = i;
                break;
            }
        }
        if (index == -1 || index == currentItem) return;

        setCurrentItem(index);
        viewPager.setCurrentItem(index);

    }

    private class MainPagerAdaper extends FragmentPagerAdapter {
        private static final int TAB_NUM = 4;
        private Context mContext;

        public MainPagerAdaper(FragmentManager supportFragmentManager, Context context) {
            super(supportFragmentManager);
            mContext = context;
        }

        @Override
        public int getCount() {
            return TAB_NUM;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new SchoolFragment();
                case 1:
                    return new CicleFragment();
                case 2:
                    return new FindFragment();
                default:
                    return new ProfileFragment();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
