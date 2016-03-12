package top.bryon.pb.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import top.bryon.pb.R;
import top.bryon.pb.ui.widget.ItemView;
import top.bryon.pb.ui.widget.TopTitleView;

/**
 * Created by bryonliu on 2016/3/6.
 */
public class ProfileFragment extends BaseFragment {

    @Bind(R.id.it_syllabus)
    ItemView mSyllabus;

    @Bind(R.id.it_offices)
    ItemView mItemOffices;
    @Bind(R.id.it_monney)
    ItemView mItemMonney;
    @Bind(R.id.it_mail)
    ItemView mItemMail;
    @Bind(R.id.it_collect)
    ItemView mItmeCollect;
    @Bind(R.id.it_settings)
    ItemView mItemSettings;

    @Bind(R.id.topView)
    TopTitleView topTitleView;

    @Override
    public View onCreateFragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, null);
        return rootView;
    }

    @Override
    public void initView() {

        topTitleView.setAppName();

        mSyllabus.init(true, R.drawable.ic_syllabus, R.string.syllabus);
        mItemOffices.init(true, R.drawable.ic_offices, R.string.offices);
        mItemMonney.init(true, R.drawable.ic_monney, R.string.monney);
        mItemMail.init(true, R.drawable.ic_mail, R.string.mail);
        mItmeCollect.init(true, R.drawable.ic_collect, R.string.collect);
        mItemSettings.init(true, R.drawable.ic_settings, R.string.settings);
    }
}
