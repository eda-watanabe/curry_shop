package inc.eda.di.workshop.curryshop;

import javax.inject.Singleton;

import dagger.Component;
import inc.eda.di.workshop.curryshop.domain.DomainModule;
import inc.eda.di.workshop.curryshop.infra.InfraModule;
import inc.eda.di.workshop.curryshop.presentation.MainActivity;

/**
 * Created by watanabe on 2017/02/24.
 */
@Singleton
@Component(modules = {InfraModule.class, DomainModule.class, AppModule.class})
public interface AppComponent {

    void inject(MainActivity activity);
}
