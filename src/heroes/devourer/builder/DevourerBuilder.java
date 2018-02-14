package heroes.devourer.builder;

import com.google.inject.Inject;
import heroes.abstractHero.builder.HeroBuilder;
import heroes.abstractHero.resourceSupplier.HeroResourceSupplier;
import heroes.abstractHero.skills.factory.SkillFactory;
import heroes.devourer.annotation.DevourerHeroService;

public final class DevourerBuilder implements HeroBuilder {

    @Inject
    @DevourerHeroService
    private SkillFactory skillFactory;

    @Inject
    @DevourerHeroService
    private HeroResourceSupplier resourceSupplier;

    @Inject
    @DevourerHeroService
    private Class clazz;

    @Override
    public final SkillFactory getSkillFactory() {
        return skillFactory;
    }

    @Override
    public final HeroResourceSupplier getHeroResourceSupplier() {
        return resourceSupplier;
    }

    @Override
    public final Class getHeroClass() {
        return clazz;
    }
}
