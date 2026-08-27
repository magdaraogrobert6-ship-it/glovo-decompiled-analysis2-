package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.sentry.SentryClient;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeDeeplinkHandler extends wouldPushPermissionPromptDisplaylambda2 {
    public final hasTooManyZipEntrieslambda0 IconCompatParcelizer;
    public final iExternalSyntheticLambda1 serializer;
    public static final ReferenceQueue read = new ReferenceQueue();
    public static final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(BrazeDeeplinkHandler.class.getName());

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final setResourcePackageNamelambda0 IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final void IconCompatParcelizer(setResourcePackageNamelambda0 setresourcepackagenamelambda0, getFontLoaderannotations getfontloaderannotations) {
        this.IconCompatParcelizer.IconCompatParcelizer(setresourcepackagenamelambda0, getfontloaderannotations);
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final wouldPushPermissionPromptDisplaylambda2 RemoteActionCompatParcelizer() {
        iExternalSyntheticLambda1 iexternalsyntheticlambda1 = this.serializer;
        if (!iexternalsyntheticlambda1.MediaSessionCompatQueueItem.getAndSet(true)) {
            iexternalsyntheticlambda1.clear();
        }
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = this.IconCompatParcelizer;
        hastoomanyzipentrieslambda0.RemoteActionCompatParcelizer();
        return hastoomanyzipentrieslambda0;
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final JsonUtilsa read(SentryClient sentryClient, mergeJsonObjectslambda10 mergejsonobjectslambda10) {
        return this.IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.read(sentryClient, mergejsonobjectslambda10);
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda2
    public final void serializer() {
        this.IconCompatParcelizer.serializer();
    }

    @Override // o.parseJsonObjectIntoBundlelambda0
    public final String write() {
        return this.IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write();
    }

    public BrazeDeeplinkHandler(hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0) {
        this.IconCompatParcelizer = hastoomanyzipentrieslambda0;
        this.serializer = new iExternalSyntheticLambda1(this, hastoomanyzipentrieslambda0, read, RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.IconCompatParcelizer, "delegate");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
