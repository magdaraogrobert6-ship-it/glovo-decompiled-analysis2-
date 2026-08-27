package o;

import android.graphics.RectF;
import android.util.Rational;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class accessnoLocalProvidedFor implements Comparator {
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write = 1;

    public accessnoLocalProvidedFor(Rational rational, Rational rational2) {
        this.RemoteActionCompatParcelizer = rational2 == null ? new Rational(4, 3) : rational2;
        this.IconCompatParcelizer = IconCompatParcelizer(rational);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.IconCompatParcelizer;
        if (i == 0) {
            return ((Table) obj3).keysCompare((Integer) obj, (Integer) obj2, (ByteBuffer) obj4);
        }
        boolean z = false;
        if (i != 1) {
            getFunctionEK5gGoQ getfunctionek5ggoq = (getFunctionEK5gGoQ) obj;
            getFunctionEK5gGoQ getfunctionek5ggoq2 = (getFunctionEK5gGoQ) obj2;
            if (getfunctionek5ggoq == null) {
                return getfunctionek5ggoq2 != null ? 1 : 0;
            }
            if (getfunctionek5ggoq2 == null) {
                return -1;
            }
            getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer = ((getGraveEK5gGoQ) obj4).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((zzbv) obj3, getfunctionek5ggoq, getfunctionek5ggoq2);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoqRemoteActionCompatParcelizer instanceof getGEK5gGoQ);
            return (int) ((getGEK5gGoQ) getfunctionek5ggoqRemoteActionCompatParcelizer).serializer.doubleValue();
        }
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        RectF rectF = (RectF) obj4;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF rectFIconCompatParcelizer = IconCompatParcelizer(rational);
        RectF rectFIconCompatParcelizer2 = IconCompatParcelizer(rational2);
        boolean z2 = rectFIconCompatParcelizer.width() >= rectF.width() && rectFIconCompatParcelizer.height() >= rectF.height();
        if (rectFIconCompatParcelizer2.width() >= rectF.width() && rectFIconCompatParcelizer2.height() >= rectF.height()) {
            z = true;
        }
        if (z2 && z) {
            return (int) Math.signum((rectFIconCompatParcelizer.height() * rectFIconCompatParcelizer.width()) - (rectFIconCompatParcelizer2.height() * rectFIconCompatParcelizer2.width()));
        }
        if (z2) {
            return -1;
        }
        if (z) {
            return 1;
        }
        return -((int) Math.signum(RemoteActionCompatParcelizer(rectFIconCompatParcelizer, rectF) - RemoteActionCompatParcelizer(rectFIconCompatParcelizer2, rectF)));
    }

    public static float RemoteActionCompatParcelizer(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF IconCompatParcelizer(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.RemoteActionCompatParcelizer;
        if (fFloatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() <= rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }
        return new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
    }

    public accessnoLocalProvidedFor(getGraveEK5gGoQ getgraveek5ggoq, zzbv zzbvVar) {
        this.IconCompatParcelizer = getgraveek5ggoq;
        this.RemoteActionCompatParcelizer = zzbvVar;
    }

    public accessnoLocalProvidedFor(Table table, ByteBuffer byteBuffer) {
        this.RemoteActionCompatParcelizer = table;
        this.IconCompatParcelizer = byteBuffer;
    }
}
