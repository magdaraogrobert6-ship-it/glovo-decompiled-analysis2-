package kotlin.properties;

import o.IconCompatParcelizer;
import o.displayInAppMessagelambda4;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ObservableProperty implements displayInAppMessagelambda4 {
    private Object RemoteActionCompatParcelizer;

    public abstract void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2);

    public boolean beforeChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
        registerinappmessagemanagerlambda2.getClass();
        return true;
    }

    public ObservableProperty(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.displayInAppMessagelambda13
    public Object getValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2) {
        registerinappmessagemanagerlambda2.getClass();
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.displayInAppMessagelambda4
    public void setValue(Object obj, registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj2) {
        registerinappmessagemanagerlambda2.getClass();
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (beforeChange(registerinappmessagemanagerlambda2, obj3, obj2)) {
            this.RemoteActionCompatParcelizer = obj2;
            afterChange(registerinappmessagemanagerlambda2, obj3, obj2);
        }
    }

    public String toString() {
        return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("ObservableProperty(value="), this.RemoteActionCompatParcelizer, ')');
    }
}
