package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0 {
    private final int IconCompatParcelizer;
    private final ArrayList<r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI> RemoteActionCompatParcelizer;
    private final int read;
    private final int serializer;
    private final ArrayList<r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI> write;

    private void IconCompatParcelizer() {
        synchronized (this) {
            int iFloor = (int) Math.floor(this.write.size() * 0.3f);
            if (this.RemoteActionCompatParcelizer.size() - iFloor < this.read) {
                iFloor = this.RemoteActionCompatParcelizer.size() - this.read;
            }
            Iterator<r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI> it = this.write.iterator();
            while (iFloor > 0 && it.hasNext()) {
                r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI next = it.next();
                it.remove();
                this.RemoteActionCompatParcelizer.remove(next);
                iFloor--;
            }
        }
    }

    public final r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI serializer() {
        synchronized (this) {
            if (this.write.isEmpty() && this.RemoteActionCompatParcelizer.size() == this.IconCompatParcelizer) {
                return null;
            }
            if (this.write.isEmpty()) {
                r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii = new r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI(this.serializer, this);
                r8lambdadmnir0ikfqv2uyaz5k1ofou62ii.serializer();
                this.RemoteActionCompatParcelizer.add(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii);
                return r8lambdadmnir0ikfqv2uyaz5k1ofou62ii;
            }
            r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii2 = this.write.get(0);
            r8lambdadmnir0ikfqv2uyaz5k1ofou62ii2.serializer();
            this.write.remove(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii2);
            return r8lambdadmnir0ikfqv2uyaz5k1ofou62ii2;
        }
    }

    public r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0(int i, int i2, int i3) {
        i2 = i > i2 ? i : i2;
        this.RemoteActionCompatParcelizer = new ArrayList<>();
        this.write = new ArrayList<>();
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.serializer = i3;
        synchronized (this) {
            for (int i4 = 0; i4 < this.read; i4++) {
                r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii = new r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI(this.serializer, this);
                this.RemoteActionCompatParcelizer.add(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii);
                this.write.add(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii);
            }
        }
    }

    public final void serializer(r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI r8lambdadmnir0ikfqv2uyaz5k1ofou62ii) {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer.contains(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii)) {
                this.write.add(r8lambdadmnir0ikfqv2uyaz5k1ofou62ii);
                IconCompatParcelizer();
            }
        }
    }
}
