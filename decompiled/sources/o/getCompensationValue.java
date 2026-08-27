package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes4.dex */
public final class getCompensationValue extends BasicPermission {
    public final int read;
    public final String write;

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.write;
    }

    public getCompensationValue(String str) {
        int i;
        super("BC", str);
        this.write = str;
        int i2 = evaluateFeaturefwf_client_releasedefault.RemoteActionCompatParcelizer;
        char[] charArray = str.toCharArray();
        int i3 = 0;
        boolean z = false;
        for (int i4 = 0; i4 != charArray.length; i4++) {
            char c = charArray[i4];
            if ('A' <= c && 'Z' >= c) {
                charArray[i4] = (char) (c + ' ');
                z = true;
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(z ? new String(charArray) : str, " ,");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i = i3 | 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i = i3 | 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i = i3 | 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i = i3 | 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i = i3 | 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i = i3 | 32;
            } else if (strNextToken.equals("all")) {
                i = 63;
            }
            i3 = i;
        }
        if (i3 == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown permissions passed to mask");
            throw null;
        }
        this.read = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCompensationValue)) {
            return false;
        }
        getCompensationValue getcompensationvalue = (getCompensationValue) obj;
        return this.read == getcompensationvalue.read && getName().equals(getcompensationvalue.getName());
    }

    public final int hashCode() {
        return getName().hashCode() + this.read;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof getCompensationValue) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = ((getCompensationValue) permission).read;
        return (this.read & i) == i;
    }
}
