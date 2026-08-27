package com.roadrunner.rider.recruitment.accountcreation.password_creation.domain;

import androidx.compose.ui.graphics.Fields;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountCreationException extends Exception {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final Throwable IconCompatParcelizer;
    public final String serializer;

    public AccountCreationException(Throwable th) {
        super("An exception was thrown during the process of creating a password.", th);
        this.serializer = "An exception was thrown during the process of creating a password.";
        this.IconCompatParcelizer = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 115;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Throwable th = this.IconCompatParcelizer;
        int i5 = i2 + 3;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 57;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.serializer;
        int i4 = i2 + 21;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0 ? (str = this.serializer) != null : (str = this.serializer) != null) {
            iHashCode = str.hashCode();
            int i3 = RemoteActionCompatParcelizer + 101;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode = 0;
        }
        Throwable th = this.IconCompatParcelizer;
        return (iHashCode * 31) + (th != null ? th.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        String str = "AccountCreationException(message=" + this.serializer + ", cause=" + this.IconCompatParcelizer + ")";
        int i2 = write + 49;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof AccountCreationException))) {
            AccountCreationException accountCreationException = (AccountCreationException) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, accountCreationException.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, accountCreationException.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 43;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = write;
        int i5 = i4 + 103;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 101;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 98 / 0;
        }
        return false;
    }
}
