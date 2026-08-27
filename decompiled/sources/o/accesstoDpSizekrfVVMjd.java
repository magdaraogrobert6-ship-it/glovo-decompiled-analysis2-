package o;

/* JADX INFO: loaded from: classes.dex */
public final class accesstoDpSizekrfVVMjd extends DropShadowScope {
    public static accesstoDpSizekrfVVMjd serializer(String str) {
        accesstoDpSizekrfVVMjd accesstodpsizekrfvvmjd = new accesstoDpSizekrfVVMjd(str.toCharArray());
        accesstodpsizekrfvvmjd.write = 0L;
        accesstodpsizekrfvvmjd.write(str.length() - 1);
        return accesstodpsizekrfvvmjd;
    }

    @Override // o.DropShadowScope
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof accesstoDpSizekrfVVMjd) && write().equals(((accesstoDpSizekrfVVMjd) obj).write())) {
            return true;
        }
        return super.equals(obj);
    }

    public accesstoDpSizekrfVVMjd(char[] cArr) {
        super(cArr);
    }
}
