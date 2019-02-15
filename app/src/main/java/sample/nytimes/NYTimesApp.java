package sample.nytimes;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

/**
 * Created by gturedi on 15.02.2019.
 */
public class NYTimesApp
        extends Application {

    /**
     * app level shared context without memory leak problem
     */
    private static NYTimesApp instance;

    public static Context getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.i("onCreate");
        instance = this;
        if (BuildConfig.DEBUG) Timber.plant(new Timber.DebugTree());
    }

}