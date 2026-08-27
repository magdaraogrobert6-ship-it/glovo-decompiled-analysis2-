package com.roadrunner.appmigration.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker$startWork$1;
import coil3.ImageLoader$Builder;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.SemanticsModifierDefaultImpls;
import o.SemanticsNodedefault;
import o.clearAndSetSemantics;
import o.findCoordinatorToGetBoundsui;
import o.generateSemanticsId;
import o.getContentViewGroupParentLayout;
import o.mergedSemanticsConfiguration;
import o.semantics;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMigrationUiModelImpl implements SemanticsModifierDefaultImpls {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ImageLoader$Builder IconCompatParcelizer;
    public final StateFlow MediaMetadataCompat;
    public final mergedSemanticsConfiguration RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final SemanticsNodedefault serializer;
    public final MutableStateFlow write;

    @Override // o.findNestedRecyclerView
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 43;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i3 + 83;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public AppMigrationUiModelImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, SemanticsNodedefault semanticsNodedefault, ImageLoader$Builder imageLoader$Builder, mergedSemanticsConfiguration mergedsemanticsconfiguration) {
        getcontentviewgroupparentlayout.getClass();
        semanticsNodedefault.getClass();
        imageLoader$Builder.getClass();
        mergedsemanticsconfiguration.getClass();
        this.serializer = semanticsNodedefault;
        this.IconCompatParcelizer = imageLoader$Builder;
        this.RemoteActionCompatParcelizer = mergedsemanticsconfiguration;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(generateSemanticsId.read);
        this.write = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        this.read = FlowKt.write(new StateProviderImpl$special$$inlined$map$2(mutableStateFlow, 3), getcontentviewgroupparentlayout, SharingStarted.Companion.RemoteActionCompatParcelizer, Boolean.FALSE);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 11), 3);
    }

    public final void IconCompatParcelizer() {
        clearAndSetSemantics clearandsetsemantics;
        int i = 2 % 2;
        MutableStateFlow mutableStateFlow = this.write;
        Object obj = mutableStateFlow.read();
        findCoordinatorToGetBoundsui findcoordinatortogetboundsuiIconCompatParcelizer = null;
        if (obj instanceof clearAndSetSemantics) {
            clearandsetsemantics = (clearAndSetSemantics) obj;
            int i2 = MediaSessionCompatQueueItem + 35;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            clearandsetsemantics = null;
        }
        if (clearandsetsemantics != null) {
            int i4 = MediaDescriptionCompat + 97;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                semantics semanticsVar = clearandsetsemantics.RemoteActionCompatParcelizer;
                mergedSemanticsConfiguration mergedsemanticsconfiguration = this.RemoteActionCompatParcelizer;
                mergedsemanticsconfiguration.getClass();
                mergedsemanticsconfiguration.serializer.logEvent("garnet_popup_dismissed", mergedSemanticsConfiguration.write(semanticsVar));
                int i5 = 78 / 0;
            } else {
                semantics semanticsVar2 = clearandsetsemantics.RemoteActionCompatParcelizer;
                mergedSemanticsConfiguration mergedsemanticsconfiguration2 = this.RemoteActionCompatParcelizer;
                mergedsemanticsconfiguration2.getClass();
                mergedsemanticsconfiguration2.serializer.logEvent("garnet_popup_dismissed", mergedSemanticsConfiguration.write(semanticsVar2));
            }
            int i6 = MediaDescriptionCompat + 17;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        MutableStateFlow mutableStateFlow2 = this.serializer.serializer;
        findCoordinatorToGetBoundsui findcoordinatortogetboundsui = (findCoordinatorToGetBoundsui) mutableStateFlow2.read();
        if (findcoordinatortogetboundsui != null) {
            int i8 = MediaSessionCompatQueueItem + 73;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            findcoordinatortogetboundsuiIconCompatParcelizer = findCoordinatorToGetBoundsui.IconCompatParcelizer(findcoordinatortogetboundsui);
        }
        mutableStateFlow2.IconCompatParcelizer(findcoordinatortogetboundsuiIconCompatParcelizer);
        mutableStateFlow.IconCompatParcelizer(generateSemanticsId.read);
    }
}
