package o;

import com.sentiance.sdk.feature.Feature;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class getNotificationBadgeNumber extends migrateTriggersReeligibilityToJsonlambda1<List<Feature>> {
    final /* synthetic */ getConversationPersonMap serializer;

    public getNotificationBadgeNumber(getConversationPersonMap getconversationpersonmap) {
        this.serializer = getconversationpersonmap;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda1
    public final List<Feature> RemoteActionCompatParcelizer() {
        return getConversationPersonMap.RemoteActionCompatParcelizer(this.serializer);
    }
}
