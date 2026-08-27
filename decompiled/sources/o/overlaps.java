package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class overlaps {
    public double IconCompatParcelizer;
    public double MediaBrowserCompatMediaItem;
    public double MediaDescriptionCompat;
    public final AutofillApi27Helper MediaMetadataCompat;
    public double MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public double RemoteActionCompatParcelizer;
    public double read;
    public double serializer;
    public double write;

    public final AutofillApi27Helper RemoteActionCompatParcelizer(long j, double d, double d2) {
        double dCos;
        double d3;
        if (!this.RatingCompat) {
            if (this.IconCompatParcelizer == Double.MAX_VALUE) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d4 = this.read;
            if (d4 > 1.0d) {
                double d5 = this.MediaDescriptionCompat;
                this.write = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                double d6 = this.read;
                double d7 = this.MediaDescriptionCompat;
                this.serializer = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
            } else if (d4 >= 0.0d && d4 < 1.0d) {
                this.RemoteActionCompatParcelizer = Math.sqrt(1.0d - (d4 * d4)) * this.MediaDescriptionCompat;
            }
            this.RatingCompat = true;
        }
        double d8 = j / 1000.0d;
        double d9 = d - this.IconCompatParcelizer;
        double d10 = this.read;
        if (d10 > 1.0d) {
            double d11 = this.serializer;
            double d12 = ((d11 * d9) - d2) / (d11 - this.write);
            double d13 = d9 - d12;
            double dPow = (Math.pow(2.718281828459045d, this.write * d8) * d12) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d14 = this.serializer;
            double dPow2 = Math.pow(2.718281828459045d, d14 * d8);
            double d15 = this.write;
            dCos = (Math.pow(2.718281828459045d, d8 * d15) * d12 * d15) + (dPow2 * d13 * d14);
            d3 = dPow;
        } else if (d10 == 1.0d) {
            double d16 = this.MediaDescriptionCompat;
            double d17 = (d16 * d9) + d2;
            double d18 = (d17 * d8) + d9;
            double dPow3 = Math.pow(2.718281828459045d, (-d16) * d8);
            double dPow4 = Math.pow(2.718281828459045d, (-this.MediaDescriptionCompat) * d8);
            double d19 = -this.MediaDescriptionCompat;
            dCos = (Math.pow(2.718281828459045d, d8 * d19) * d17) + (dPow4 * d18 * d19);
            d3 = dPow3 * d18;
        } else {
            double d20 = 1.0d / this.RemoteActionCompatParcelizer;
            double d21 = this.MediaDescriptionCompat;
            double d22 = ((d10 * d21 * d9) + d2) * d20;
            double dSin = ((Math.sin(this.RemoteActionCompatParcelizer * d8) * d22) + (Math.cos(this.RemoteActionCompatParcelizer * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d21 * d8);
            double d23 = this.MediaDescriptionCompat;
            double d24 = -d23;
            double d25 = this.read;
            double dPow5 = Math.pow(2.718281828459045d, (-d25) * d23 * d8);
            double d26 = this.RemoteActionCompatParcelizer;
            double d27 = -d26;
            double dSin2 = Math.sin(d26 * d8);
            double d28 = this.RemoteActionCompatParcelizer;
            dCos = (((Math.cos(d8 * d28) * d22 * d28) + (dSin2 * d27 * d9)) * dPow5) + (d24 * dSin * d25);
            d3 = dSin;
        }
        float f = (float) (d3 + this.IconCompatParcelizer);
        AutofillApi27Helper autofillApi27Helper = this.MediaMetadataCompat;
        autofillApi27Helper.RemoteActionCompatParcelizer = f;
        autofillApi27Helper.serializer = (float) dCos;
        return autofillApi27Helper;
    }

    public final void read(float f) {
        if (f > 0.0f) {
            this.MediaDescriptionCompat = Math.sqrt(f);
            this.RatingCompat = false;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Spring stiffness constant must be positive.");
        }
    }

    public overlaps() {
        this.MediaDescriptionCompat = Math.sqrt(1500.0d);
        this.read = 0.5d;
        this.RatingCompat = false;
        this.IconCompatParcelizer = Double.MAX_VALUE;
        this.MediaMetadataCompat = new AutofillApi27Helper(0);
    }

    public overlaps(float f) {
        this.MediaDescriptionCompat = Math.sqrt(1500.0d);
        this.read = 0.5d;
        this.RatingCompat = false;
        this.MediaMetadataCompat = new AutofillApi27Helper(0);
        this.IconCompatParcelizer = f;
    }
}
