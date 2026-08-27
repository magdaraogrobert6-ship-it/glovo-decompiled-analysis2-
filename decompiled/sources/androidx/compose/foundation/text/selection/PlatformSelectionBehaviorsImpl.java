package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.Modifier;
import o.ModifierCompanion;
import o.ModifierDefaultImpls;
import o.ModifierElement;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextAnnouncementContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.getDetachedListenerui;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.onShowTranslationui;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl implements Modifier {
    public final ModifierElement MediaBrowserCompatMediaItem;
    public TextClassifier MediaSessionCompatQueueItem;
    public final Context read;
    public final TextAnnouncementContentCardView serializer;
    public final LocaleList write;
    public final MutexImpl IconCompatParcelizer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    public final PopulateViewStructure_androidKtpopulate7 MediaDescriptionCompat = CompositionKt.RemoteActionCompatParcelizer(null);
    public final Object RemoteActionCompatParcelizer = new Object();

    public PlatformSelectionBehaviorsImpl(TextAnnouncementContentCardView textAnnouncementContentCardView, Context context, ModifierElement modifierElement, LocaleList localeList) {
        this.serializer = textAnnouncementContentCardView;
        this.read = context;
        this.MediaBrowserCompatMediaItem = modifierElement;
        this.write = localeList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: access$classifyText-M8tDOmk, reason: not valid java name */
    public static final Object m110access$classifyTextM8tDOmk(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, CharSequence charSequence, long j, TextClassifier textClassifier, ContinuationImpl continuationImpl) {
        ModifierDefaultImpls modifierDefaultImpls;
        TextClassifier textClassifier2;
        long j2;
        CharSequence charSequence2;
        MutexImpl mutexImpl;
        TextClassification textClassificationClassifyText;
        long j3;
        CharSequence charSequence3;
        MutexImpl mutexImpl2 = platformSelectionBehaviorsImpl.IconCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = platformSelectionBehaviorsImpl.MediaDescriptionCompat;
        if (continuationImpl instanceof ModifierDefaultImpls) {
            modifierDefaultImpls = (ModifierDefaultImpls) continuationImpl;
            int i = modifierDefaultImpls.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                modifierDefaultImpls.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                modifierDefaultImpls = new ModifierDefaultImpls(platformSelectionBehaviorsImpl, continuationImpl);
            }
        } else {
            modifierDefaultImpls = new ModifierDefaultImpls(platformSelectionBehaviorsImpl, continuationImpl);
        }
        Object obj = modifierDefaultImpls.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = modifierDefaultImpls.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                modifierDefaultImpls.IconCompatParcelizer = charSequence;
                textClassifier2 = textClassifier;
                modifierDefaultImpls.serializer = textClassifier2;
                modifierDefaultImpls.read = mutexImpl2;
                j2 = j;
                modifierDefaultImpls.write = j2;
                modifierDefaultImpls.RemoteActionCompatParcelizer = 1;
                if (mutexImpl2.lock(modifierDefaultImpls) != coroutineSingletons) {
                    charSequence2 = charSequence;
                    mutexImpl = mutexImpl2;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                j2 = modifierDefaultImpls.write;
                MutexImpl mutexImpl3 = modifierDefaultImpls.read;
                TextClassifier textClassifier3 = (TextClassifier) modifierDefaultImpls.serializer;
                charSequence2 = modifierDefaultImpls.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                mutexImpl = mutexImpl3;
                textClassifier2 = textClassifier3;
            } else if (i2 == 2) {
                j3 = modifierDefaultImpls.write;
                mutexImpl2 = modifierDefaultImpls.read;
                textClassificationClassifyText = (TextClassification) modifierDefaultImpls.serializer;
                charSequence3 = modifierDefaultImpls.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(new getDetachedListenerui(charSequence3, j3, textClassificationClassifyText));
                return createfromparcel;
            } finally {
                mutexImpl2.write(null);
            }
            getDetachedListenerui getdetachedlistenerui = (getDetachedListenerui) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue();
            if (getdetachedlistenerui != null) {
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = ModifierCompanion.read;
                if (TextRange.m3069equalsimpl0(j2, getdetachedlistenerui.write)) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{charSequence2, getdetachedlistenerui.serializer}, getCieXyz.write())).booleanValue()) {
                        mutexImpl.write(null);
                        return createfromparcel;
                    }
                }
            }
            mutexImpl.write(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, TextRange.m3074getMinimpl(j2), TextRange.m3073getMaximpl(j2)).setDefaultLocales(platformSelectionBehaviorsImpl.serializer()).build());
            modifierDefaultImpls.IconCompatParcelizer = charSequence2;
            modifierDefaultImpls.serializer = textClassificationClassifyText;
            modifierDefaultImpls.read = mutexImpl2;
            modifierDefaultImpls.write = j2;
            modifierDefaultImpls.RemoteActionCompatParcelizer = 2;
            if (mutexImpl2.lock(modifierDefaultImpls) != coroutineSingletons) {
                j3 = j2;
                charSequence3 = charSequence2;
                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(new getDetachedListenerui(charSequence3, j3, textClassificationClassifyText));
                return createfromparcel;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            mutexImpl.write(null);
            throw th;
        }
    }

    public final android.os.LocaleList serializer() {
        LocaleList localeList = this.write;
        if (localeList == null) {
            return new android.os.LocaleList(Locale.Companion.getCurrent().getPlatformLocale());
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
