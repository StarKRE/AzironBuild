package heroes.devourer.recourceSupplier;

import heroes.abstractHero.resourceSupplier.HeroResourceSupplier;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;

import java.util.ArrayList;
import java.util.List;

public final class DevourerResourceSupplier extends HeroResourceSupplier{

    @Override
    public List<Media> getAttackVoiceList() {
        return null;
    }

    @Override
    public List<Media> getTreatmentVoiceList() {
        return null;
    }

    @Override
    public final List<GetSkill> getSuperSkillResources() {
        return new ArrayList<>(){{
            add(new GetSkill(getFlameSnakesSpriteInstance(), getFlameSnakesDescriptionInstance(), new ArrayList<>()));
            add(new GetSkill(getRegenerationSpriteInstance(), getRegenerationDescriptionInstance(), new ArrayList<>()));
            add(new GetSkill(getConsumingSpriteInstance(), getConsumingDescriptionInstance(), new ArrayList<>()));
        }};
    }

    @Override
    public final GetSkill getSwapSkillResources() {
        return new GetSkill(getDepletionSpriteInstance(), getDepletionDescriptionInstance(), new ArrayList<>());
    }

    private ImageView getDepletionSpriteInstance(){
        return superSkillSpriteFormat(getSkillPath());
    }

    private ImageView getDepletionDescriptionInstance(){
        return skillDescriptionFormat(getSkillPath());
    }

    private ImageView getFlameSnakesSpriteInstance(){
        return superSkillSpriteFormat(getSkillPath() + "flameSnakes" + sprite);
    }

    private ImageView getFlameSnakesDescriptionInstance(){
        return skillDescriptionFormat(getSkillPath() + "flameSnakes" + description);
    }

    private ImageView getRegenerationSpriteInstance(){
        return superSkillSpriteFormat(getSkillPath() + "regeneration" + sprite);
    }

    private ImageView getRegenerationDescriptionInstance(){
        return skillDescriptionFormat(getSkillPath() + "regeneration" + description);
    }

    private ImageView getConsumingSpriteInstance(){
        return superSkillSpriteFormat(getSkillPath() + "consuming" + sprite);
    }

    private ImageView getConsumingDescriptionInstance(){
        return skillDescriptionFormat(getSkillPath() + "consuming" + description);
    }

    //Presentation:
    @Override
    public final List<Media> getPresentationVoiceList() {
        return null;
    }

    @Override
    public final String getHeroPath() {
        return "file:src\\resources\\heroes\\devourer\\";
    }
}
