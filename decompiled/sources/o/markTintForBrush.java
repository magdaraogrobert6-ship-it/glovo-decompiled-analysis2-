package o;

import org.bouncycastle.asn1.ASN1UniversalType;

/* JADX INFO: loaded from: classes2.dex */
public final class markTintForBrush extends ASN1UniversalType {
    public static final markTintForBrush read = new markTintForBrush(3, "smu_on_create");
    public static final markTintForBrush write = new markTintForBrush(3, "smu_on_pause");
    public static final markTintForBrush IconCompatParcelizer = new markTintForBrush(3, "smu_on_start");

    public markTintForBrush(int i, Object obj) {
        super(i, obj);
    }
}
