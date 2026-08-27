package com.qualtrics.digital;

/* JADX INFO: loaded from: classes4.dex */
class DisplayOptions {
    String displayRate;
    boolean hasRandomization;
    String noshow;

    public boolean getHasActionSetRandomization() {
        return this.hasRandomization;
    }

    public double getPreventRepeatedDisplayInDays() {
        String str = this.noshow;
        if (str == null) {
            return 0.0d;
        }
        return Double.parseDouble(str);
    }

    public double getSamplingRate() {
        String str = this.displayRate;
        if (str == null) {
            return 0.0d;
        }
        return Double.parseDouble(str);
    }
}
