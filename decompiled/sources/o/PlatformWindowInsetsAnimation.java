package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformWindowInsetsAnimation {
    public ColorStateList ComponentActivity;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatResultReceiverWrapper;
    public SubcomposeSlotReusePolicy MediaSessionCompatToken;
    public RippleDrawable ParcelableVolumeInfo;
    public final MaterialButton PlaybackStateCompat;
    public ColorStateList PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public SubcomposeLayoutPausableCompositionException r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ColorStateList read;
    public PorterDuff.Mode serializer;
    public int write;
    public boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
    public boolean IconCompatParcelizer = false;
    public boolean MediaSessionCompatQueueItem = false;
    public boolean ResultReceiver = true;

    public final void write() {
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(false);
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicyRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(true);
        if (subcomposeSlotReusePolicyRemoteActionCompatParcelizer != null) {
            float f = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            ColorStateList colorStateList = this.ComponentActivity;
            subcomposeSlotReusePolicyRemoteActionCompatParcelizer.getLifecycle.ParcelableVolumeInfo = f;
            subcomposeSlotReusePolicyRemoteActionCompatParcelizer.invalidateSelf();
            accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicyRemoteActionCompatParcelizer.getLifecycle;
            if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList) {
                accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList;
                subcomposeSlotReusePolicyRemoteActionCompatParcelizer.onStateChange(subcomposeSlotReusePolicyRemoteActionCompatParcelizer.getState());
            }
            if (subcomposeSlotReusePolicyRemoteActionCompatParcelizer2 != null) {
                float f2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                int iRemoteActionCompatParcelizer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys ? mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorSurface, this.PlaybackStateCompat) : 0;
                subcomposeSlotReusePolicyRemoteActionCompatParcelizer2.getLifecycle.ParcelableVolumeInfo = f2;
                subcomposeSlotReusePolicyRemoteActionCompatParcelizer2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iRemoteActionCompatParcelizer);
                accessgetReusedSlotIdp accessgetreusedslotidp2 = subcomposeSlotReusePolicyRemoteActionCompatParcelizer2.getLifecycle;
                if (accessgetreusedslotidp2.PlaybackStateCompatCustomAction != colorStateListValueOf) {
                    accessgetreusedslotidp2.PlaybackStateCompatCustomAction = colorStateListValueOf;
                    subcomposeSlotReusePolicyRemoteActionCompatParcelizer2.onStateChange(subcomposeSlotReusePolicyRemoteActionCompatParcelizer2.getState());
                }
            }
        }
    }

    public final void IconCompatParcelizer(int i, int i2) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        MaterialButton materialButton = this.PlaybackStateCompat;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.MediaSessionCompatResultReceiverWrapper;
        int i4 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i2;
        this.MediaSessionCompatResultReceiverWrapper = i;
        if (!this.IconCompatParcelizer) {
            RemoteActionCompatParcelizer();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void RemoteActionCompatParcelizer() {
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        MaterialButton materialButton = this.PlaybackStateCompat;
        subcomposeSlotReusePolicy.write(materialButton.getContext());
        subcomposeSlotReusePolicy.setTintList(this.read);
        PorterDuff.Mode mode = this.serializer;
        if (mode != null) {
            subcomposeSlotReusePolicy.setTintMode(mode);
        }
        float f = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ColorStateList colorStateList = this.ComponentActivity;
        subcomposeSlotReusePolicy.getLifecycle.ParcelableVolumeInfo = f;
        subcomposeSlotReusePolicy.invalidateSelf();
        accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy.getLifecycle;
        if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList) {
            accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList;
            subcomposeSlotReusePolicy.onStateChange(subcomposeSlotReusePolicy.getState());
        }
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = new SubcomposeSlotReusePolicy(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        subcomposeSlotReusePolicy2.setTint(0);
        float f2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iRemoteActionCompatParcelizer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys ? mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorSurface, materialButton) : 0;
        subcomposeSlotReusePolicy2.getLifecycle.ParcelableVolumeInfo = f2;
        subcomposeSlotReusePolicy2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iRemoteActionCompatParcelizer);
        accessgetReusedSlotIdp accessgetreusedslotidp2 = subcomposeSlotReusePolicy2.getLifecycle;
        if (accessgetreusedslotidp2.PlaybackStateCompatCustomAction != colorStateListValueOf) {
            accessgetreusedslotidp2.PlaybackStateCompatCustomAction = colorStateListValueOf;
            subcomposeSlotReusePolicy2.onStateChange(subcomposeSlotReusePolicy2.getState());
        }
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy3 = new SubcomposeSlotReusePolicy(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        this.MediaSessionCompatToken = subcomposeSlotReusePolicy3;
        subcomposeSlotReusePolicy3.setTint(-1);
        ColorStateList colorStateListValueOf2 = this.PlaybackStateCompatCustomAction;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{subcomposeSlotReusePolicy2, subcomposeSlotReusePolicy}), this.RatingCompat, this.MediaSessionCompatResultReceiverWrapper, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat), this.MediaSessionCompatToken);
        this.ParcelableVolumeInfo = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(false);
        if (subcomposeSlotReusePolicyRemoteActionCompatParcelizer != null) {
            subcomposeSlotReusePolicyRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(this.MediaMetadataCompat);
            subcomposeSlotReusePolicyRemoteActionCompatParcelizer.setState(materialButton.getDrawableState());
        }
    }

    public final void serializer(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = subcomposeLayoutPausableCompositionException;
        if (RemoteActionCompatParcelizer(false) != null) {
            RemoteActionCompatParcelizer(false).setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        }
        if (RemoteActionCompatParcelizer(true) != null) {
            RemoteActionCompatParcelizer(true).setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        }
        if (serializer() != null) {
            serializer().setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        }
    }

    public PlatformWindowInsetsAnimation(MaterialButton materialButton, SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.PlaybackStateCompat = materialButton;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = subcomposeLayoutPausableCompositionException;
    }

    public final SubcomposeSlotReusePolicy RemoteActionCompatParcelizer(boolean z) {
        RippleDrawable rippleDrawable = this.ParcelableVolumeInfo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (SubcomposeSlotReusePolicy) ((LayerDrawable) ((InsetDrawable) this.ParcelableVolumeInfo.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final createPausedPrecomposition serializer() {
        RippleDrawable rippleDrawable = this.ParcelableVolumeInfo;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.ParcelableVolumeInfo.getNumberOfLayers();
        RippleDrawable rippleDrawable2 = this.ParcelableVolumeInfo;
        return numberOfLayers > 2 ? (createPausedPrecomposition) rippleDrawable2.getDrawable(2) : (createPausedPrecomposition) rippleDrawable2.getDrawable(1);
    }
}
