package azironBots;

/**
 * Контроллер-бот является контейнером, в котором храняться все уровни сложности ИИ, а также является регулятором
 * режимов игры с ботами.
 */
public class ControllerBot {


    private Boolean gameWithPC = false;
    public void playingEasyBot() {
//        //Бот "Лорд Вамп"
//        if (player1.getHero().getClass() == HeroLordVamp.class) {
//            if (player1.getHero().getSkills().isThreeOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().threeUlt();
//            } else if (player1.getHero().getSkills().isFirstOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().firstUlt();
//            } else if (player1.getHero().getHitPoints() < player2.getHero().getAttack() * 0.5) {
//                try {
//                    battle.treatment(player1, player2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else if (player1.getHero().getSkills().isTwoOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().twoUlt();
//            } else {
//                battle.damage(player1, player2);
//            }
//        }
//        //Бот "Пожиратель"
//        else if (player1.getHero().getClass() == HeroDevourer.class) {
//            if (player1.getHero().getSkills().isThreeOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().threeUlt();
//            } else if (player1.getHero().getSkills().isTwoOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().twoUlt();
//            } else if (player1.getHero().getHitPoints() < player2.getHero().getAttack() * 1) {
//                try {
//                    battle.treatment(player1, player2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else if (player1.getHero().getSkills().isFirstOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().firstUlt();
//            } else {
//                battle.damage(player1, player2);
//            }
//        }
//        //Бот "Оглушитель"
//        else {
//            if (player1.getHero().getHitPoints() < player2.getHero().getAttack() * 2.5) {
//                try {
//                    battle.treatment(player1, player2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else if (player1.getHero().getSkills().isThreeOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().threeUlt();
//            } else if (player1.getHero().getSkills().isTwoOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().twoUlt();
//            } else if (player1.getHero().getSkills().isFirstOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().firstUlt();
//            } else {
//                battle.damage(player1, player2);
//            }
//        }
//    }
//
//    public void playingNormalBot() {
//        //Бот "Лорд Вамп"
//        if (player1.getHero().getClass() == HeroLordVamp.class) {
//            // "Использование реинкорнации"
//            if (player1.getHero().getSkills().isThreeOpen() && player1.getHero().getHitPoints() * (-1) > player2.getHero().getAttack()) {
//                    turn *= -1;
//                    player1.getHero().getSkills().threeUlt();
//            }
//            // Использование "Каннибализма"
//            else if (player1.getHero().getSkills().isFirstOpen() && (player1.getHero().getLevel() >=
//                    player2.getHero().getLevel() || player1.getHero().getHitPoints() <=
//                    player1.getHero().getHealthSupply() * 0.3)) {
//                turn *= -1;
//                player1.getHero().getSkills().firstUlt();
//            }
//            //Использование "Лечения"
//            else if (player1.getHero().getHitPoints() < player2.getHero().getAttack() * 0.5 ||
//                    (player1.getHero().getHitPoints() <= player1.getHero().getHealthSupply() * 0.3 && turns % 8 == 0)) {
//                try {
//                    battle.treatment(player1, player2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            //Использование "Клинков"
//            else if (player1.getHero().getSkills().isTwoOpen() &&
//                    player1.getHero().getExperienceList()[player1.getHero().getLevel() - 1] -
//                            player1.getHero().getExperience() > player1.getHero().getAttack() * 2){
//                turn *= -1;
//                player1.getHero().getSkills().twoUlt();
//            }
//            //Использование атаки
//            else {
//                battle.damage(player1, player2);
//            }
//        }
//        //Бот "Пожиратель"
//        else if (player1.getHero().getClass() == HeroDevourer.class) {
//            if (player1.getHero().getSkills().isThreeOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().threeUlt();
//            } else if (player1.getHero().getSkills().isTwoOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().twoUlt();
//            } else if (player1.getHero().getHitPoints() < player2.getHero().getAttack() * 1) {
//                try {
//                    battle.treatment(player1, player2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else if (player1.getHero().getSkills().isFirstOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().firstUlt();
//            } else {
//                battle.damage(player1, player2);
//            }
//        }
//        //Бот "Оглушитель"
//        else {
//            if (player1.getHero().getHitPoints() < player2.getHero().getAttack() * 2.5) {
//                try {
//                    battle.treatment(player1, player2);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            } else if (player1.getHero().getSkills().isThreeOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().threeUlt();
//            } else if (player1.getHero().getSkills().isTwoOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().twoUlt();
//            } else if (player1.getHero().getSkills().isFirstOpen()) {
//                turn *= -1;
//                player1.getHero().getSkills().firstUlt();
//            } else {
//                battle.damage(player1, player2);
//            }
//        }
    }

    public void installGameWithBot(){
//        String[] namePCList = new File("src\\Profiles").list();
//        assert namePCList != null;
//        int indexList = (int) (Math.random() * namePCList.length);
//        String namePC = namePCList[indexList]
//                .substring(0, namePCList[indexList].length() - 4);
//        profile1 = new Profile(namePC);
//        BufferedReader bufferedReader = null;
//        try {
//            bufferedReader = new BufferedReader(new FileReader(new File("src\\Profiles\\" + profile1.getName() + ".hoa")));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
//        String[] parts = lines.get(2).split("/");
//        profile1 = new Profile(lines.get(0), Byte.parseByte(parts[0]), Integer.parseInt(parts[1]),
//                Integer.parseInt(lines.get(3)), Integer.parseInt(lines.get(4)), Integer.parseInt(lines.get(5)),
//                Integer.parseInt(lines.get(6)), Integer.parseInt(lines.get(7)));
//        double variant = Math.random() * 90;
//        if (variant > 60) profile1.setPlayer(new Player(namePC, new HeroOrcBasher(true)));
//        else if (variant > 30) profile1.setPlayer(new Player(namePC, new HeroLordVamp(true)));
//        else profile1.setPlayer(new Player(namePC, new HeroDevourer(true)));
//        Image cursor = new Image("file:src\\Picture\\Mouse\\cursor.png");
//        ImageCursor imageCursor = new ImageCursor(cursor);
//        azironStage.getScene().setCursor(imageCursor);

    }



    public Boolean getGameWithPC() {
        return gameWithPC;
    }

    public void setGameWithPC(Boolean gameWithPC) {
        this.gameWithPC = gameWithPC;
    }
}
