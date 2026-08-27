package o;

import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.ObservableEmitter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE implements io.sentry.instrumentation.file.RemoteActionCompatParcelizer, CompletableOnSubscribe {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE(Object obj, int i, Object obj2) {
        this.read = i;
        this.serializer = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // io.sentry.instrumentation.file.RemoteActionCompatParcelizer
    public Object RemoteActionCompatParcelizer() throws IOException {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        if (i == 1) {
            return Integer.valueOf(((io.sentry.instrumentation.file.write) obj2).write.read((byte[]) obj));
        }
        if (i != 2) {
            byte[] bArr = (byte[]) obj;
            ((io.sentry.instrumentation.file.serializer) obj2).RemoteActionCompatParcelizer.write(bArr);
            return Integer.valueOf(bArr.length);
        }
        int i2 = ((io.sentry.instrumentation.file.write) obj2).write.read();
        ((AtomicInteger) obj).set(i2);
        return Integer.valueOf(i2 == -1 ? 0 : 1);
    }

    @Override // io.reactivex.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) this.serializer;
        ClearDataUseCaseImpl$invoke$2 clearDataUseCaseImpl$invoke$2 = (ClearDataUseCaseImpl$invoke$2) this.IconCompatParcelizer;
        TextAnnouncementContentCardView textAnnouncementContentCardViewIconCompatParcelizer = androidx.sqlite.SQLite.IconCompatParcelizer((TextAnnouncementContentCardView) r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, textAnnouncementContentCardView, true);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        if (textAnnouncementContentCardViewIconCompatParcelizer != defaultScheduler && textAnnouncementContentCardViewIconCompatParcelizer.get(ShortNewsContentCardViewCompanion.serializer) == null) {
            textAnnouncementContentCardViewIconCompatParcelizer = textAnnouncementContentCardViewIconCompatParcelizer.plus(defaultScheduler);
        }
        r8lambdaHnQ0TaKjW7L8s_wmIGAk0Wm18Q r8lambdahnq0takjw7l8s_wmigak0wm18q = new r8lambdaHnQ0TaKjW7L8s_wmIGAk0Wm18Q(textAnnouncementContentCardViewIconCompatParcelizer, completableEmitter);
        completableEmitter.read(new InAppMessageManagerBase(r8lambdahnq0takjw7l8s_wmigak0wm18q));
        CoroutineStart.DEFAULT.invoke(clearDataUseCaseImpl$invoke$2, r8lambdahnq0takjw7l8s_wmigak0wm18q, r8lambdahnq0takjw7l8s_wmigak0wm18q);
    }

    public void IconCompatParcelizer(ObservableEmitter observableEmitter) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) this.serializer;
        Flow flow = (Flow) this.IconCompatParcelizer;
        observableEmitter.IconCompatParcelizer(new InAppMessageManagerBase(BuildersKt.IconCompatParcelizer(setViewAccessibilityFlagMap.serializer, prepareForActivityTransitionCarryover.read.plus(textAnnouncementContentCardView), CoroutineStart.ATOMIC, new RxConvertKt$asObservable$1$job$1(flow, observableEmitter, null, 0))));
    }
}
