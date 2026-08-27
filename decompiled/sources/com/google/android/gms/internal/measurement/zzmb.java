package com.google.android.gms.internal.measurement;

import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.List;
import o.SoftKeyboardInterceptionModifierNode;
import o.SoftwareKeyboardInterceptionModifierKt;
import o.getDispatcher;
import o.isMetaPressedZmokQxo;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setCalculateNestedScrollScopeui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmb implements Cloneable {
    public SoftwareKeyboardInterceptionModifierKt IconCompatParcelizer;
    public final SoftwareKeyboardInterceptionModifierKt read;

    public final void ParcelableVolumeInfo() {
        if (this.IconCompatParcelizer.startActivityForResult()) {
            return;
        }
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) this.read.RemoteActionCompatParcelizer(4);
        setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(softwareKeyboardInterceptionModifierKt.getClass()).RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKt, this.IconCompatParcelizer);
        this.IconCompatParcelizer = softwareKeyboardInterceptionModifierKt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.SoftwareKeyboardInterceptionModifierKt r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        /*
            r3 = this;
            o.SoftwareKeyboardInterceptionModifierKt r0 = r3.IconCompatParcelizer
            boolean r0 = r0.startActivityForResult()
            o.SoftwareKeyboardInterceptionModifierKt r1 = r3.IconCompatParcelizer
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            r1.setPictureInPictureParams()
            o.SoftwareKeyboardInterceptionModifierKt r1 = r3.IconCompatParcelizer
        L10:
            r1.getClass()
            r0 = 1
            java.lang.Object r2 = r1.RemoteActionCompatParcelizer(r0)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto L21
            goto L37
        L21:
            if (r2 == 0) goto L38
            o.setCalculateNestedScrollScopeui r0 = o.setCalculateNestedScrollScopeui.serializer
            java.lang.Class r2 = r1.getClass()
            o.getDispatcher r0 = r0.IconCompatParcelizer(r2)
            boolean r0 = r0.serializer(r1)
            r2 = 2
            r1.RemoteActionCompatParcelizer(r2)
            if (r0 == 0) goto L38
        L37:
            return r1
        L38:
            com.google.android.gms.internal.measurement.zzoh r0 = new com.google.android.gms.internal.measurement.zzoh
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmb.r8lambda54BeH8ZsBru0CXI2CCSP2syNys():o.SoftwareKeyboardInterceptionModifierKt");
    }

    public final void serializer(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt) {
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2 = this.read;
        if (softwareKeyboardInterceptionModifierKt2.equals(softwareKeyboardInterceptionModifierKt)) {
            return;
        }
        if (!this.IconCompatParcelizer.startActivityForResult()) {
            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt3 = (SoftwareKeyboardInterceptionModifierKt) softwareKeyboardInterceptionModifierKt2.RemoteActionCompatParcelizer(4);
            setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(softwareKeyboardInterceptionModifierKt3.getClass()).RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKt3, this.IconCompatParcelizer);
            this.IconCompatParcelizer = softwareKeyboardInterceptionModifierKt3;
        }
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt4 = this.IconCompatParcelizer;
        setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(softwareKeyboardInterceptionModifierKt4.getClass()).RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKt4, softwareKeyboardInterceptionModifierKt);
    }

    public final void serializer(byte[] bArr, int i, SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode) throws zzmr {
        if (!this.IconCompatParcelizer.startActivityForResult()) {
            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = (SoftwareKeyboardInterceptionModifierKt) this.read.RemoteActionCompatParcelizer(4);
            setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(softwareKeyboardInterceptionModifierKt.getClass()).RemoteActionCompatParcelizer(softwareKeyboardInterceptionModifierKt, this.IconCompatParcelizer);
            this.IconCompatParcelizer = softwareKeyboardInterceptionModifierKt;
        }
        try {
            getDispatcher getdispatcherIconCompatParcelizer = setCalculateNestedScrollScopeui.serializer.IconCompatParcelizer(this.IconCompatParcelizer.getClass());
            SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt2 = this.IconCompatParcelizer;
            isMetaPressedZmokQxo ismetapressedzmokqxo = new isMetaPressedZmokQxo();
            softKeyboardInterceptionModifierNode.getClass();
            getdispatcherIconCompatParcelizer.read(softwareKeyboardInterceptionModifierKt2, bArr, 0, i, ismetapressedzmokqxo);
        } catch (zzmr e) {
            throw e;
        } catch (IOException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            GooglePlayLocationUtils$$ExternalSyntheticLambda18.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public zzmb(SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt) {
        this.read = softwareKeyboardInterceptionModifierKt;
        if (softwareKeyboardInterceptionModifierKt.startActivityForResult()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Default instance must be immutable.");
            throw null;
        }
        this.IconCompatParcelizer = (SoftwareKeyboardInterceptionModifierKt) softwareKeyboardInterceptionModifierKt.RemoteActionCompatParcelizer(4);
    }

    /* JADX INFO: renamed from: r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, reason: merged with bridge method [inline-methods] */
    public final zzmb clone() {
        zzmb zzmbVar = (zzmb) this.read.RemoteActionCompatParcelizer(5);
        boolean zStartActivityForResult = this.IconCompatParcelizer.startActivityForResult();
        SoftwareKeyboardInterceptionModifierKt softwareKeyboardInterceptionModifierKt = this.IconCompatParcelizer;
        if (zStartActivityForResult) {
            softwareKeyboardInterceptionModifierKt.setPictureInPictureParams();
            softwareKeyboardInterceptionModifierKt = this.IconCompatParcelizer;
        }
        zzmbVar.IconCompatParcelizer = softwareKeyboardInterceptionModifierKt;
        return zzmbVar;
    }

    public static void IconCompatParcelizer(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }
}
