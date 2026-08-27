package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class copyzey9I6wdefault extends android.graphics.Paint {
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyzey9I6wdefault(PorterDuff.Mode mode) {
        super(1);
        this.read = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (this.read != 0) {
            super.setAlpha(i);
        } else if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(getD50.write(i));
        } else {
            setColor((getD50.write(i) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(android.os.LocaleList localeList) {
        if (this.read != 0) {
            super.setTextLocales(localeList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ copyzey9I6wdefault(int i, int i2) {
        super(i);
        this.read = i2;
    }
}
