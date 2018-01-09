package nyc.c4q.design_pattern_inclass.question3;

/**
 * Created by yokilam on 1/7/18.
 */

public class Thanksgiving {
    private boolean turkey;
    private boolean cranberry;
    private boolean corn;
    private boolean mashedpotatoes;
    private boolean stuffing;
    private boolean gravy;
    private boolean quiche;
    private boolean stringBeans;
    private boolean spinach;
    private String pasta;
    private String pie;

    private Thanksgiving(boolean turkey, boolean cranberry, boolean corn, boolean mashedpotatoes, boolean stuffing, boolean gravy, boolean quiche, boolean stringBeans, boolean spinach, String pasta, String pie) {
        this.turkey = turkey;
        this.cranberry = cranberry;
        this.corn = corn;
        this.mashedpotatoes = mashedpotatoes;
        this.stuffing = stuffing;
        this.gravy = gravy;
        this.quiche = quiche;
        this.stringBeans = stringBeans;
        this.spinach = spinach;
        this.pasta = pasta;
        this.pie = pie;
    }

    public boolean isTurkey() {
        return turkey;
    }

    public boolean isCranberry() {
        return cranberry;
    }

    public boolean isCorn() {
        return corn;
    }

    public boolean isMashedpotatoes() {
        return mashedpotatoes;
    }

    public boolean isStuffing() {
        return stuffing;
    }

    public boolean isGravy() {
        return gravy;
    }

    public boolean isQuiche() {
        return quiche;
    }

    public boolean isStringBeans() {
        return stringBeans;
    }

    public boolean isSpinach() {
        return spinach;
    }

    public String getPasta() {
        return pasta;
    }

    public String getPie() {
        return pie;
    }

    public static class ThanksgivingBuilder{
        private boolean turkey;
        private boolean cranberry;
        private boolean corn;
        private boolean mashedpotatoes;
        private boolean stuffing;
        private boolean gravy;
        private boolean quiche;
        private boolean stringBeans;
        private boolean spinach;
        private String pasta;
        private String pie;

        public ThanksgivingBuilder(){

        }

        public ThanksgivingBuilder setTurkey(boolean turkey) {
            this.turkey = turkey;
            return this;
        }

        public ThanksgivingBuilder setCranberry(boolean cranberry) {
            this.cranberry = cranberry;
            return this;
        }

        public ThanksgivingBuilder setCorn(boolean corn) {
            this.corn = corn;
            return this;
        }

        public ThanksgivingBuilder setMashedpotatoes(boolean mashedpotatoes) {
            this.mashedpotatoes = mashedpotatoes;
            return this;
        }

        public ThanksgivingBuilder setStuffing(boolean stuffing) {
            this.stuffing = stuffing;
            return this;
        }

        public ThanksgivingBuilder setGravy(boolean gravy) {
            this.gravy = gravy;
            return this;
        }

        public ThanksgivingBuilder setQuiche(boolean quiche) {
            this.quiche = quiche;
            return this;
        }

        public ThanksgivingBuilder setStringBeans(boolean stringBeans) {
            this.stringBeans = stringBeans;
            return this;
        }

        public ThanksgivingBuilder setSpinach(boolean spinach) {
            this.spinach = spinach;
            return this;
        }

        public ThanksgivingBuilder setPasta(String pasta) {
            this.pasta = pasta;
            return this;
        }

        public ThanksgivingBuilder setPie(String pie) {
            this.pie = pie;
            return this;
        }

        public Thanksgiving build(){
            return new Thanksgiving(turkey,cranberry, corn, mashedpotatoes, stuffing,gravy,quiche, stringBeans,spinach, pasta, pie);
        }
    }
}
