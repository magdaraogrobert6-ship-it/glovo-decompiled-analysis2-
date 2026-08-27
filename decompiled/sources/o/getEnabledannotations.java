package o;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class getEnabledannotations {
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatMediaItem;
    private final getPropertiesJsonannotations RatingCompat;
    private final ArrayList RemoteActionCompatParcelizer;
    private final String read;
    private final r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 serializer;
    private final r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 write;

    public final getPropertiesJsonannotations IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 read() {
        return this.serializer;
    }

    public final String serializer() {
        return this.IconCompatParcelizer;
    }

    public final ArrayList write() {
        return this.RemoteActionCompatParcelizer;
    }

    public getEnabledannotations(String str, String str2, r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8, r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m9, boolean z, getPropertiesJsonannotations getpropertiesjsonannotations) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompatMediaItem = z;
        this.serializer = r8lambdajlmt1f20uzpc4qzytuhq8199m8;
        this.write = r8lambdajlmt1f20uzpc4qzytuhq8199m9;
        this.RatingCompat = getpropertiesjsonannotations;
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventUploadRequest{id='");
        sb.append(this.IconCompatParcelizer);
        sb.append("', tag='");
        sb.append(this.read);
        sb.append("', fromDate=");
        sb.append(this.serializer);
        sb.append(", toDate=");
        sb.append(this.write);
        sb.append(", eventTypes=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", includeAllEvents=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.MediaBrowserCompatMediaItem, '}');
    }

    public getEnabledannotations(String str, r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8, r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m9, boolean z, getPropertiesJsonannotations getpropertiesjsonannotations) {
        this(UUID.randomUUID().toString(), str, r8lambdajlmt1f20uzpc4qzytuhq8199m8, r8lambdajlmt1f20uzpc4qzytuhq8199m9, z, getpropertiesjsonannotations);
    }

    public getEnabledannotations(String str, String str2, r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8, r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m9, List<Integer> list, getPropertiesJsonannotations getpropertiesjsonannotations) {
        this(str, str2, r8lambdajlmt1f20uzpc4qzytuhq8199m8, r8lambdajlmt1f20uzpc4qzytuhq8199m9, false, getpropertiesjsonannotations);
        this.RemoteActionCompatParcelizer.addAll(list);
    }
}
