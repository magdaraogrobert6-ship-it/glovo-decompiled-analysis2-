package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonBcp extends accessgetCaptionscp {
    public accessgetButtonSelectcp read;
    public accessgetContactscp serializer;

    public final accessgetButtonBcp serializer(accessgetContactscp accessgetcontactscp) {
        this.serializer = accessgetcontactscp;
        return this;
    }

    public final accessgetButtonBcp write(accessgetButtonSelectcp accessgetbuttonselectcp) {
        this.read = accessgetbuttonselectcp;
        return this;
    }

    public final accessgetButtonModecp IconCompatParcelizer() {
        return new accessgetButtonModecp(this.read, this.serializer);
    }
}
