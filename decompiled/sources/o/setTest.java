package o;

import com.sentiance.sdk.configuration.ConfigurationManager;

/* JADX INFO: loaded from: classes3.dex */
public final class setTest {
    private final int IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final ConfigurationManager read;

    public final void read(r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I r8lambdadi1pzc9jwwh1yuj2mzylqjyqd1i) {
        if (this.read.ensureViewModelStore() && this.IconCompatParcelizer >= 200 && this.RemoteActionCompatParcelizer >= 60000) {
            r8lambdadi1pzc9jwwh1yuj2mzylqjyqd1i.run();
        }
    }

    private setTest(ConfigurationManager configurationManager, int i, long j) {
        this.read = configurationManager;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = j;
    }

    public final void IconCompatParcelizer(ControlCard controlCard) {
        if (this.IconCompatParcelizer < 200 || this.RemoteActionCompatParcelizer < 120000) {
            return;
        }
        controlCard.run();
    }

    public final void IconCompatParcelizer(TextAnnouncementCard textAnnouncementCard) {
        if (this.IconCompatParcelizer < 200 || this.RemoteActionCompatParcelizer < 60000) {
            return;
        }
        textAnnouncementCard.run();
    }

    public final void RemoteActionCompatParcelizer(onCardUpdate oncardupdate) {
        if (this.IconCompatParcelizer < 200 || this.RemoteActionCompatParcelizer < 60000) {
            return;
        }
        oncardupdate.run();
    }

    public final void read(ControlCard controlCard) {
        if (this.IconCompatParcelizer < 200 || this.RemoteActionCompatParcelizer < 120000) {
            return;
        }
        controlCard.run();
    }

    public final void read(TextAnnouncementCard textAnnouncementCard) {
        if (this.IconCompatParcelizer < 200 || this.RemoteActionCompatParcelizer < 60000) {
            return;
        }
        textAnnouncementCard.run();
    }

    public final void write(r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I r8lambdadi1pzc9jwwh1yuj2mzylqjyqd1i) {
        if (this.IconCompatParcelizer < 200 || this.RemoteActionCompatParcelizer < 60000) {
            return;
        }
        r8lambdadi1pzc9jwwh1yuj2mzylqjyqd1i.run();
    }

    public static setTest read(ConfigurationManager configurationManager, int i, long j) {
        return new setTest(configurationManager, i, j);
    }
}
