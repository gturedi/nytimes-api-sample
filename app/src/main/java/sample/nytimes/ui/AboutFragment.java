package sample.nytimes.ui;

import android.support.v4.app.Fragment;

import sample.nytimes.R;

/**
 * Created by gturedi on 15.02.2019.
 */
public class AboutFragment extends BaseFragment {

    public static Fragment create() {
        return new AboutFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_about;
    }

}
