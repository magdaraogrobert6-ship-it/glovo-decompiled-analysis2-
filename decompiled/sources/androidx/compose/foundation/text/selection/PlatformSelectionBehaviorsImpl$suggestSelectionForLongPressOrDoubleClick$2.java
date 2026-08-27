package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.MutexImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getDetachedListenerui;
import o.onShowTranslationui;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public MutexImpl IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public PlatformSelectionBehaviorsImpl MediaMetadataCompat;
    public CharSequence MediaSessionCompatQueueItem;
    public final /* synthetic */ PlatformSelectionBehaviorsImpl RatingCompat;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ CharSequence serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(long j, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = charSequence;
        this.RemoteActionCompatParcelizer = j;
        this.RatingCompat = platformSelectionBehaviorsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.RemoteActionCompatParcelizer, this.RatingCompat, this.serializer, shortNewsContentCardView);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.read = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create((TextClassifier) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        MutexImpl mutexImpl;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        CharSequence charSequence;
        TextSelection textSelection;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TextClassifier textClassifier = (TextClassifier) this.read;
            long j2 = this.RemoteActionCompatParcelizer;
            int iM3074getMinimpl = TextRange.m3074getMinimpl(j2);
            int iM3073getMaximpl = TextRange.m3073getMaximpl(j2);
            CharSequence charSequence2 = this.serializer;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iM3074getMinimpl, iM3073getMaximpl);
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.RatingCompat;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(platformSelectionBehaviorsImpl2.serializer());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jTextRange = TextRangeKt.TextRange(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.write = jTextRange;
                this.MediaDescriptionCompat = 2;
                if (PlatformSelectionBehaviorsImpl.m110access$classifyTextM8tDOmk(this.RatingCompat, charSequence2, jTextRange, textClassifier, this) != coroutineSingletons) {
                    j = jTextRange;
                }
            } else {
                mutexImpl = platformSelectionBehaviorsImpl2.IconCompatParcelizer;
                this.read = textSelectionSuggestSelection;
                this.IconCompatParcelizer = mutexImpl;
                this.MediaMetadataCompat = platformSelectionBehaviorsImpl2;
                this.MediaSessionCompatQueueItem = charSequence2;
                this.write = jTextRange;
                this.MediaDescriptionCompat = 1;
                if (mutexImpl.lock(this) != coroutineSingletons) {
                    platformSelectionBehaviorsImpl = platformSelectionBehaviorsImpl2;
                    charSequence = charSequence2;
                    textSelection = textSelectionSuggestSelection;
                    j = jTextRange;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    ((onShowTranslationui) platformSelectionBehaviorsImpl.MediaDescriptionCompat).setValue(new getDetachedListenerui(charSequence, j, textClassification));
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.write;
            charSequence = this.MediaSessionCompatQueueItem;
            platformSelectionBehaviorsImpl = this.MediaMetadataCompat;
            mutexImpl = this.IconCompatParcelizer;
            textSelection = (TextSelection) this.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                ((onShowTranslationui) platformSelectionBehaviorsImpl.MediaDescriptionCompat).setValue(new getDetachedListenerui(charSequence, j, textClassification2));
            } finally {
                mutexImpl.write(null);
            }
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return TextRange.m3064boximpl(j);
    }
}
