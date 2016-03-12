package top.bryon.pb.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import top.bryon.pb.R;
import top.bryon.pb.ui.widget.TopTitleView;

/**
 * Created by bryonliu on 2016/3/6.
 */
public class CicleFragment extends BaseFragment {

    @Bind(R.id.topView)
    TopTitleView topTitleView;

    @Override
    public View onCreateFragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_circle, null);
        return rootView;
    }

    @Override
    public void initView() {
        topTitleView.setTextViewVisble();
    }
}
