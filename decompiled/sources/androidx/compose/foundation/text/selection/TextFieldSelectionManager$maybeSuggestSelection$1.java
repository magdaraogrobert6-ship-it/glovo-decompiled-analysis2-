package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.Modifier;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ OffsetMapping IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public final /* synthetic */ TextFieldSelectionManager MediaMetadataCompat;
    public final /* synthetic */ Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ TextRange serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(Modifier modifier, String str, long j, TextRange textRange, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = modifier;
        this.write = str;
        this.read = j;
        this.serializer = textRange;
        this.MediaMetadataCompat = textFieldSelectionManager;
        this.IconCompatParcelizer = offsetMapping;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.RemoteActionCompatParcelizer, this.write, this.read, this.serializer, this.MediaMetadataCompat, this.IconCompatParcelizer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objWithContext;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaDescriptionCompat;
        String str = this.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.MediaDescriptionCompat = 1;
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.RemoteActionCompatParcelizer;
            platformSelectionBehaviorsImpl.getClass();
            if (str.length() == 0) {
                objWithContext = null;
            } else {
                long j = this.read;
                if (TextRange.m3070getCollapsedimpl(j)) {
                    objWithContext = null;
                } else {
                    objWithContext = BuildersKt.withContext(platformSelectionBehaviorsImpl.serializer, new NavHostKt$NavHost$29$1(platformSelectionBehaviorsImpl, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(j, platformSelectionBehaviorsImpl, str, null), null, 6), this);
                }
            }
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objWithContext = obj;
        }
        TextRange textRange = (TextRange) objWithContext;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (textRange != null) {
            long jM3080unboximpl = textRange.m3080unboximpl();
            int iM3076getStartimpl = TextRange.m3076getStartimpl(jM3080unboximpl);
            OffsetMapping offsetMapping = this.IconCompatParcelizer;
            long jTextRange = TextRangeKt.TextRange(offsetMapping.transformedToOriginal(iM3076getStartimpl), offsetMapping.transformedToOriginal(TextRange.m3071getEndimpl(jM3080unboximpl)));
            if (!TextRange.m3068equalsimpl(jTextRange, this.serializer)) {
                TextFieldSelectionManager textFieldSelectionManager = this.MediaMetadataCompat;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldSelectionManager.MediaDescriptionCompat().getText(), str}, getCieXyz.write())).booleanValue() && offsetMapping == textFieldSelectionManager.PlaybackStateCompatCustomAction) {
                    textFieldSelectionManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(TextFieldSelectionManager.serializer(textFieldSelectionManager.MediaDescriptionCompat().getAnnotatedString(), jTextRange));
                    textFieldSelectionManager.MediaSessionCompatToken = TextRange.m3064boximpl(jTextRange);
                }
            }
        }
        return createfromparcel;
    }
}
