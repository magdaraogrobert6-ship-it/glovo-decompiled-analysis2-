package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class setContentViewGroupParentLayout implements DefaultInAppMessageViewWrapperWhenMappings {
    public final boolean serializer;

    @Override // o.DefaultInAppMessageViewWrapperWhenMappings
    public final boolean F_() {
        return this.serializer;
    }

    @Override // o.DefaultInAppMessageViewWrapperWhenMappings
    public final DefaultInAppMessageViewWrappercreateDismissCallbacks1 read() {
        return null;
    }

    public setContentViewGroupParentLayout(boolean z) {
        this.serializer = z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.serializer) {
            str = "Active";
        } else {
            str = "New";
        }
        return ff$$ExternalSyntheticOutline0.m(sb, str, '}');
    }
}
