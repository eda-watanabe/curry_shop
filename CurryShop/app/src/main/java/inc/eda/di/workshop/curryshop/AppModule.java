package inc.eda.di.workshop.curryshop;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by watanabe on 2017/02/24.
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideAppContext() {
        return application.getApplicationContext();
    }
}
