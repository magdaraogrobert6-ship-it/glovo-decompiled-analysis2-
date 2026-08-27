package androidx.compose.ui.text;

import androidx.compose.ui.graphics.drawscope.DrawStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletSpanWithLevel {
    public static final int $stable = DrawStyle.$stable;
    private final Bullet bullet;
    private final int indentationLevel;
    private final int start;

    public final Bullet component1() {
        return this.bullet;
    }

    public final int component2() {
        return this.indentationLevel;
    }

    public final int component3() {
        return this.start;
    }

    public final Bullet getBullet() {
        return this.bullet;
    }

    public final int getIndentationLevel() {
        return this.indentationLevel;
    }

    public final int getStart() {
        return this.start;
    }

    public final BulletSpanWithLevel copy(Bullet bullet, int i, int i2) {
        return new BulletSpanWithLevel(bullet, i, i2);
    }

    public int hashCode() {
        return Integer.hashCode(this.start) + af$$ExternalSyntheticOutline0.m(this.indentationLevel, this.bullet.hashCode() * 31, 31);
    }

    public BulletSpanWithLevel(Bullet bullet, int i, int i2) {
        this.bullet = bullet;
        this.indentationLevel = i;
        this.start = i2;
    }

    public static /* synthetic */ BulletSpanWithLevel copy$default(BulletSpanWithLevel bulletSpanWithLevel, Bullet bullet, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bullet = bulletSpanWithLevel.bullet;
        }
        if ((i3 & 2) != 0) {
            i = bulletSpanWithLevel.indentationLevel;
        }
        if ((i3 & 4) != 0) {
            i2 = bulletSpanWithLevel.start;
        }
        return bulletSpanWithLevel.copy(bullet, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bullet, bulletSpanWithLevel.bullet}, getCieXyz.write())).booleanValue() && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.bullet);
        sb.append(", indentationLevel=");
        sb.append(this.indentationLevel);
        sb.append(", start=");
        return af$$ExternalSyntheticOutline0.m(sb, this.start, ')');
    }
}
