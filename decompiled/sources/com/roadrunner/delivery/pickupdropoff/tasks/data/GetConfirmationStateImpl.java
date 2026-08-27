package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$combine$1$3;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import o.AsyncFontListLoaderloadWithTimeoutOrNull2;
import o.ComposeAnimationClock;
import o.FontListFontFamilyTypefaceAdapter;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessgetPermanentCachep;
import o.getEmptyBox;
import o.getOptimizationLevel;
import o.getPosition;
import o.getPositionannotations;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.keyPosition;
import o.onContentCardDismissed;
import o.prepareForActivityTransitionCarryover;
import o.putdefault;
import o.r8lambda8L8lXCy99H67Fo1WTKvaQj9opM;
import o.r8lambdaI0rwLnY7SWJ2zbMkkgoBaCvlVM;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.toFontFamily;
import o.uiMode;
import o.withRect;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetConfirmationStateImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final SaveHeatmapUrlImpl IconCompatParcelizer;
    public final withRect RemoteActionCompatParcelizer;
    public final ConfirmationRepository read;
    public final isOpenInternalroom_runtime serializer;

    public GetConfirmationStateImpl(isOpenInternalroom_runtime isopeninternalroom_runtime, ConfirmationRepository confirmationRepository, SaveHeatmapUrlImpl saveHeatmapUrlImpl, withRect withrect) {
        isopeninternalroom_runtime.getClass();
        confirmationRepository.getClass();
        saveHeatmapUrlImpl.getClass();
        withrect.getClass();
        this.serializer = isopeninternalroom_runtime;
        this.read = confirmationRepository;
        this.IconCompatParcelizer = saveHeatmapUrlImpl;
        this.RemoteActionCompatParcelizer = withrect;
    }

    public final Flow serializer(r8lambda8L8lXCy99H67Fo1WTKvaQj9opM r8lambda8l8lxcy99h67fo1wtkvaqj9opm) {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(FlowKt.read(new ReconnectScheduler$schedule$1(this, r8lambda8l8lxcy99h67fo1wtkvaqj9opm, shortNewsContentCardView, 3)), new SettingsViewModel$special$$inlined$combine$1$3(this, shortNewsContentCardView, 8));
        ((inCompatibilityMode) this.serializer).getClass();
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
        int i2 = write + 79;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return flowRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object access$doWork(GetConfirmationStateImpl getConfirmationStateImpl, r8lambda8L8lXCy99H67Fo1WTKvaQj9opM r8lambda8l8lxcy99h67fo1wtkvaqj9opm, ContinuationImpl continuationImpl) throws Throwable {
        ComposeAnimationClock composeAnimationClock;
        r8lambda8L8lXCy99H67Fo1WTKvaQj9opM r8lambda8l8lxcy99h67fo1wtkvaqj9opm2;
        SaveHeatmapUrlImpl saveHeatmapUrlImpl;
        String strWrite;
        String str;
        List listIconCompatParcelizer;
        String strWrite2;
        List listRemoteActionCompatParcelizer;
        List list;
        keyPosition keyposition;
        getPositionannotations getpositionannotations;
        keyPosition keyposition2;
        List listIconCompatParcelizer2;
        int i = 2 % 2;
        if (continuationImpl instanceof ComposeAnimationClock) {
            composeAnimationClock = (ComposeAnimationClock) continuationImpl;
            int i2 = composeAnimationClock.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                composeAnimationClock.write = i2 - Integer.MIN_VALUE;
            } else {
                composeAnimationClock = new ComposeAnimationClock(getConfirmationStateImpl, continuationImpl);
            }
        } else {
            composeAnimationClock = new ComposeAnimationClock(getConfirmationStateImpl, continuationImpl);
        }
        Object obj = composeAnimationClock.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = composeAnimationClock.write;
        Object obj2 = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SaveHeatmapUrlImpl saveHeatmapUrlImpl2 = getConfirmationStateImpl.IconCompatParcelizer;
            ConfirmationRepository confirmationRepository = getConfirmationStateImpl.read;
            long jWrite = r8lambda8l8lxcy99h67fo1wtkvaqj9opm.write();
            composeAnimationClock.IconCompatParcelizer = r8lambda8l8lxcy99h67fo1wtkvaqj9opm;
            composeAnimationClock.read = saveHeatmapUrlImpl2;
            composeAnimationClock.write = 1;
            Object confirmationResponse = confirmationRepository.getConfirmationResponse(jWrite, composeAnimationClock);
            if (confirmationResponse == coroutineSingletons) {
                return coroutineSingletons;
            }
            r8lambda8l8lxcy99h67fo1wtkvaqj9opm2 = r8lambda8l8lxcy99h67fo1wtkvaqj9opm;
            obj = confirmationResponse;
            saveHeatmapUrlImpl = saveHeatmapUrlImpl2;
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            saveHeatmapUrlImpl = composeAnimationClock.read;
            r8lambda8l8lxcy99h67fo1wtkvaqj9opm2 = composeAnimationClock.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        AsyncFontListLoaderloadWithTimeoutOrNull2 asyncFontListLoaderloadWithTimeoutOrNull2 = (AsyncFontListLoaderloadWithTimeoutOrNull2) ((getOptimizationLevel) obj).IconCompatParcelizer();
        long jWrite2 = r8lambda8l8lxcy99h67fo1wtkvaqj9opm2.write();
        saveHeatmapUrlImpl.getClass();
        asyncFontListLoaderloadWithTimeoutOrNull2.getClass();
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer = ((r8lambdaI0rwLnY7SWJ2zbMkkgoBaCvlVM) saveHeatmapUrlImpl.serializer).RemoteActionCompatParcelizer(asyncFontListLoaderloadWithTimeoutOrNull2);
        putdefault putdefaultVarRemoteActionCompatParcelizer = asyncFontListLoaderloadWithTimeoutOrNull2.RemoteActionCompatParcelizer();
        String strSerializer = putdefaultVarRemoteActionCompatParcelizer != null ? putdefaultVarRemoteActionCompatParcelizer.serializer() : null;
        String str2 = strSerializer == null ? "" : strSerializer;
        putdefault putdefaultVarRemoteActionCompatParcelizer2 = asyncFontListLoaderloadWithTimeoutOrNull2.RemoteActionCompatParcelizer();
        if (putdefaultVarRemoteActionCompatParcelizer2 != null) {
            int i4 = MediaBrowserCompatMediaItem + 23;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                putdefaultVarRemoteActionCompatParcelizer2.write();
                obj2.hashCode();
                throw null;
            }
            strWrite = putdefaultVarRemoteActionCompatParcelizer2.write();
        } else {
            strWrite = null;
        }
        String str3 = strWrite == null ? "" : strWrite;
        putdefault putdefaultVarRemoteActionCompatParcelizer3 = asyncFontListLoaderloadWithTimeoutOrNull2.RemoteActionCompatParcelizer();
        String strRemoteActionCompatParcelizer = putdefaultVarRemoteActionCompatParcelizer3 != null ? putdefaultVarRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer() : null;
        String str4 = strRemoteActionCompatParcelizer == null ? "" : strRemoteActionCompatParcelizer;
        putdefault putdefaultVarRemoteActionCompatParcelizer4 = asyncFontListLoaderloadWithTimeoutOrNull2.RemoteActionCompatParcelizer();
        String strIconCompatParcelizer = putdefaultVarRemoteActionCompatParcelizer4 != null ? putdefaultVarRemoteActionCompatParcelizer4.IconCompatParcelizer() : null;
        if (strIconCompatParcelizer == null) {
            int i5 = MediaBrowserCompatMediaItem + 37;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str = "";
        } else {
            str = strIconCompatParcelizer;
        }
        boolean zIsEmpty = r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer.isEmpty();
        List listIconCompatParcelizer3 = asyncFontListLoaderloadWithTimeoutOrNull2.IconCompatParcelizer();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        List list2 = listIconCompatParcelizer3 == null ? instance_delegatelambda0Var : listIconCompatParcelizer3;
        toFontFamily tofontfamily = SaveHeatmapUrlImpl.read(asyncFontListLoaderloadWithTimeoutOrNull2);
        if (tofontfamily == null || (listIconCompatParcelizer = tofontfamily.IconCompatParcelizer()) == null) {
            listIconCompatParcelizer = instance_delegatelambda0Var;
        }
        List<FontListFontFamilyTypefaceAdapter> list3 = listIconCompatParcelizer;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        for (FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter : list3) {
            arrayList.add(new getPosition(fontListFontFamilyTypefaceAdapter.read(), fontListFontFamilyTypefaceAdapter.write(), fontListFontFamilyTypefaceAdapter.serializer()));
        }
        toFontFamily tofontfamily2 = SaveHeatmapUrlImpl.read(asyncFontListLoaderloadWithTimeoutOrNull2);
        if (tofontfamily2 == null || (listIconCompatParcelizer2 = tofontfamily2.IconCompatParcelizer()) == null) {
            strWrite2 = null;
        } else {
            int i7 = write + 53;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2 = (FontListFontFamilyTypefaceAdapter) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer2);
            if (fontListFontFamilyTypefaceAdapter2 != null) {
                strWrite2 = fontListFontFamilyTypefaceAdapter2.write();
                int i9 = MediaBrowserCompatMediaItem + 61;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                strWrite2 = null;
            }
        }
        String str5 = strWrite2 == null ? "" : strWrite2;
        toFontFamily tofontfamily3 = SaveHeatmapUrlImpl.read(asyncFontListLoaderloadWithTimeoutOrNull2);
        if (tofontfamily3 == null || (listRemoteActionCompatParcelizer = tofontfamily3.RemoteActionCompatParcelizer()) == null) {
            listRemoteActionCompatParcelizer = instance_delegatelambda0Var;
        }
        accessgetPermanentCachep accessgetpermanentcachepSerializer = asyncFontListLoaderloadWithTimeoutOrNull2.serializer();
        if (accessgetpermanentcachepSerializer != null) {
            String strValueOf = String.valueOf(accessgetpermanentcachepSerializer.read());
            String strWrite3 = accessgetpermanentcachepSerializer.write();
            String str6 = strWrite3 != null ? strWrite3 : "";
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer, 10));
            ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer.listIterator(0);
            int i11 = write + 45;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            while (listIterator.hasNext()) {
                int i13 = write + 71;
                List list4 = listRemoteActionCompatParcelizer;
                MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    arrayList2.add(((uiMode) listIterator.next()).IconCompatParcelizer());
                    throw null;
                }
                arrayList2.add(((uiMode) listIterator.next()).IconCompatParcelizer());
                listRemoteActionCompatParcelizer = list4;
            }
            list = listRemoteActionCompatParcelizer;
            keyposition = null;
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer, 10));
            ListIterator<Object> listIterator2 = r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer.listIterator(0);
            while (listIterator2.hasNext()) {
                arrayList3.add(Boolean.valueOf(!((uiMode) listIterator2.next()).read()));
            }
            getpositionannotations = new getPositionannotations(strValueOf, str6, arrayList2, arrayList3);
        } else {
            list = listRemoteActionCompatParcelizer;
            keyposition = null;
            getpositionannotations = null;
        }
        if (getpositionannotations == null) {
            Timber.RemoteActionCompatParcelizer.write(new Error("Analytics bundle is null in confirmation tasks response"));
        }
        toFontFamily tofontfamily4 = SaveHeatmapUrlImpl.read(asyncFontListLoaderloadWithTimeoutOrNull2);
        if (tofontfamily4 == null || !(!tofontfamily4.IconCompatParcelizer().isEmpty())) {
            keyposition2 = keyposition;
        } else {
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter3 = (FontListFontFamilyTypefaceAdapter) tofontfamily4.IconCompatParcelizer().get(0);
            keyposition2 = new keyPosition(fontListFontFamilyTypefaceAdapter3.write(), tofontfamily4.write(), tofontfamily4.read(), (String) fontListFontFamilyTypefaceAdapter3.serializer().get("delivery_status"));
        }
        return new getEmptyBox(jWrite2, str2, str3, str4, str, str5, zIsEmpty, r8lambdaiidsddyirtymdul5lt6pmt2zysqRemoteActionCompatParcelizer, list2, list, arrayList, getpositionannotations, keyposition2);
    }
}
