package inc.eda.di.workshop.curryshop;

import android.app.Application;

import inc.eda.di.workshop.curryshop.domain.DomainModule;
import inc.eda.di.workshop.curryshop.infra.InfraModule;

/**
 * Created by watanabe on 2017/02/24.
 */

public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializerInjector();
    }

    private void initializerInjector() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .domainModule(new DomainModule())
                .infraModule(new InfraModule())
                .build();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
