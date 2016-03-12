package top.bryon.pb.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;
import top.bryon.pb.R;
import top.bryon.pb.ui.adapter.CategoryRecycleViewAdapter;
import top.bryon.pb.ui.widget.MyGridLayoutManager;
import top.bryon.pb.ui.widget.TipLayout;

/**
 * Created by bryonliu on 2016/3/6.
 */
public class SchoolFragment extends BaseFragment {


    @Bind(R.id.tv_inner_school)
    TextView tvInnerSchool;
    @Bind(R.id.tv_outside_school)
    TextView tvOutsideSchool;

    @Bind(R.id.lv_inner_school)
    View layoutOfInner;

    @Bind(R.id.lv_outside_school)
    View layoutOfOutSide;

    @Bind(R.id.tl_notify)
    TipLayout tipLayoutOfNotify;

    @Bind(R.id.tl_subscribe)
    TipLayout tipLayoutOfSubscribe;


    @Bind(R.id.rv_category)
    RecyclerView mRecyclerView;


    @Override
    public View onCreateFragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_school, null);
        return rootView;
    }

    @Override
    public void initView() {
        tipLayoutOfNotify.setTip(getString(R.string.notify));
        tipLayoutOfNotify.setContainDrawable(R.drawable.news);

        tipLayoutOfSubscribe.setTip(getResources().getString(R.string.query));
        tipLayoutOfSubscribe.setContainDrawable(R.drawable.news);

        mRecyclerView.setLayoutManager(new MyGridLayoutManager(getContext(), 4));
        mRecyclerView.setAdapter(new CategoryRecycleViewAdapter(getContext()));
    }

    @OnClick({R.id.tv_inner_school, R.id.tv_outside_school})
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.tv_outside_school:
                layoutOfInner.setVisibility(View.GONE);
                layoutOfOutSide.setVisibility(View.VISIBLE);
                tvInnerSchool.setTextColor(getResources().getColor(R.color.blue_gray));
                tvOutsideSchool.setTextColor(getResources().getColor(R.color.white));
                break;
            case R.id.tv_inner_school:
                layoutOfInner.setVisibility(View.VISIBLE);
                layoutOfOutSide.setVisibility(View.GONE);
                tvInnerSchool.setTextColor(getResources().getColor(R.color.white));
                tvOutsideSchool.setTextColor(getResources().getColor(R.color.blue_gray));
                break;
            default:
                break;
        }
    }
}
