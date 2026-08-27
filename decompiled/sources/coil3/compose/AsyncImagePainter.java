package coil3.compose;

import android.os.Trace;
import androidx.cardview.widget.CardView$1;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil3.ExtrasKt;
import coil3.UriKt;
import coil3.compose.internal.UtilsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.CompositeShader7EN7VTw;
import o.LinearGradientShaderVjE6UOU;
import o.PathDirection;
import o.PathEffect;
import o.PathFillType;
import o.PathHitTester;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RadialGradientShader8uybcMk;
import o.ShaderKt;
import o.ShortNewsContentCardView;
import o.SimpleGraphicsLayerModifierlayerBlock1;
import o.StampedPathEffectStyleCompanion;
import o.TextAnnouncementContentCardView;
import o.accessgetIntersectcp;
import o.accessgetTranslatecp;
import o.chainPathEffect;
import o.dashPathEffectdefault;
import o.getBlurRadius;
import o.getCieXyz;
import o.getColor0d7_KjUannotations;
import o.getContentViewGroupParentLayout;
import o.getEvenOddRgk1Os;
import o.getNoneannotations;
import o.getValue0d7_KjU;
import o.handleUrlOverridelambda1;
import o.onShowTranslationui;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.reversedefault;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setTransformQ8lPUPs;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;
import o.updateBuffersOnDisappeared;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter extends Painter implements updateBuffersOnDisappeared {
    public static final accessgetIntersectcp RemoteActionCompatParcelizer = new accessgetIntersectcp(14);
    public final StateFlow MediaDescriptionCompat;
    public boolean MediaSessionCompatQueueItem;
    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 MediaSessionCompatToken;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ParcelableVolumeInfo;
    public getContentViewGroupParentLayout PlaybackStateCompat;
    public PathFillType PlaybackStateCompatCustomAction;
    public final MutableStateFlow RatingCompat;
    public final StateFlow ResultReceiver;
    public final MutableStateFlow r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public PathDirection read;
    public ColorFilter write;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatResultReceiverWrapper = CompositionKt.RemoteActionCompatParcelizer(null);
    public float IconCompatParcelizer = 1.0f;
    public long MediaBrowserCompatMediaItem = Size.Companion.m554getUnspecifiedNHjbRc();
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = RemoteActionCompatParcelizer;
    public ContentScale serializer = ContentScale.Companion.getFit();
    public int MediaMetadataCompat = DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I();

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.IconCompatParcelizer = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.write = colorFilter;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007b  */
    public static final ShaderKt IconCompatParcelizer(AsyncImagePainter asyncImagePainter, ShaderKt shaderKt, boolean z) {
        getBlurRadius getblurradius;
        SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1 = shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        setTransformQ8lPUPs settransformq8lpupsWrite = ShaderKt.write(shaderKt);
        settransformq8lpupsWrite.ComponentActivity = new CardView$1(shaderKt, 12, asyncImagePainter);
        CompositeShader7EN7VTw compositeShader7EN7VTw = shaderKt.serializer;
        if (compositeShader7EN7VTw.RatingCompat == null) {
            settransformq8lpupsWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = SimpleGraphicsLayerModifierlayerBlock1.serializer;
        }
        if (compositeShader7EN7VTw.MediaBrowserCompatMediaItem == null) {
            ContentScale contentScale = asyncImagePainter.serializer;
            int i = UtilsKt.write;
            ContentScale.Companion companion = ContentScale.Companion;
            Object[] objArr = {contentScale, companion.getFit()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                getblurradius = getBlurRadius.FIT;
            } else {
                Object[] objArr2 = {contentScale, companion.getInside()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    getblurradius = getBlurRadius.FIT;
                } else {
                    getblurradius = getBlurRadius.FILL;
                }
            }
            settransformq8lpupsWrite.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getblurradius;
        }
        if (compositeShader7EN7VTw.MediaDescriptionCompat == null) {
            settransformq8lpupsWrite.ResultReceiver = getNoneannotations.INEXACT;
        }
        if (z) {
            r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            settransformq8lpupsWrite.MediaBrowserCompatMediaItem = r8lambda2qmxd75iptxkfld4rjabqemoamc;
            settransformq8lpupsWrite.MediaMetadataCompat = r8lambda2qmxd75iptxkfld4rjabqemoamc;
            settransformq8lpupsWrite.read = r8lambda2qmxd75iptxkfld4rjabqemoamc;
        }
        return settransformq8lpupsWrite.IconCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(AsyncImagePainter asyncImagePainter, dashPathEffectdefault dashpatheffectdefault) {
        RadialGradientShader8uybcMk radialGradientShader8uybcMk;
        Painter painterSerializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        Object objSerializer;
        updateBuffersOnDisappeared updatebuffersondisappeared;
        updateBuffersOnDisappeared updatebuffersondisappeared2;
        MutableStateFlow mutableStateFlow = asyncImagePainter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        dashPathEffectdefault dashpatheffectdefault2 = (dashPathEffectdefault) mutableStateFlow.read();
        dashPathEffectdefault dashpatheffectdefault3 = (dashPathEffectdefault) asyncImagePainter.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.invoke(dashpatheffectdefault);
        mutableStateFlow.IconCompatParcelizer(dashpatheffectdefault3);
        ContentScale contentScale = asyncImagePainter.serializer;
        if (!(dashpatheffectdefault3 instanceof AsyncImagePainter$State$Success)) {
            if (dashpatheffectdefault3 instanceof AsyncImagePainter$State$Error) {
                radialGradientShader8uybcMk = ((AsyncImagePainter$State$Error) dashpatheffectdefault3).serializer;
            } else {
                painterSerializer = null;
            }
            if (painterSerializer == null) {
                painterSerializer = dashpatheffectdefault3.serializer();
            }
            ((onShowTranslationui) asyncImagePainter.MediaSessionCompatResultReceiverWrapper).setValue(painterSerializer);
            if (dashpatheffectdefault2.serializer() != dashpatheffectdefault3.serializer()) {
                objSerializer = dashpatheffectdefault2.serializer();
                if (objSerializer instanceof updateBuffersOnDisappeared) {
                    updatebuffersondisappeared = (updateBuffersOnDisappeared) objSerializer;
                } else {
                    updatebuffersondisappeared = null;
                }
                if (updatebuffersondisappeared != null) {
                    updatebuffersondisappeared.onForgotten();
                }
                Object objSerializer2 = dashpatheffectdefault3.serializer();
                updatebuffersondisappeared2 = objSerializer2 instanceof updateBuffersOnDisappeared ? (updateBuffersOnDisappeared) objSerializer2 : null;
                if (updatebuffersondisappeared2 != null) {
                    updatebuffersondisappeared2.onRemembered();
                }
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = asyncImagePainter.ParcelableVolumeInfo;
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(dashpatheffectdefault3);
            }
        }
        radialGradientShader8uybcMk = ((AsyncImagePainter$State$Success) dashpatheffectdefault3).IconCompatParcelizer;
        StampedPathEffectStyleCompanion stampedPathEffectStyleCompanion = ((accessgetTranslatecp) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{radialGradientShader8uybcMk.write(), LinearGradientShaderVjE6UOU.MediaDescriptionCompat})).read(chainPathEffect.write, radialGradientShader8uybcMk);
        if (stampedPathEffectStyleCompanion instanceof getValue0d7_KjU) {
            Painter painterSerializer2 = dashpatheffectdefault2.serializer();
            if (!(dashpatheffectdefault2 instanceof AsyncImagePainter$State$Loading)) {
                painterSerializer2 = null;
            }
            Painter painterSerializer3 = dashpatheffectdefault3.serializer();
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            painterSerializer = new CrossfadePainter(painterSerializer2, painterSerializer3, contentScale, UriKt.RemoteActionCompatParcelizer(((getValue0d7_KjU) stampedPathEffectStyleCompanion).read, setUnregisteredInAppMessage.MILLISECONDS), ((radialGradientShader8uybcMk instanceof getColor0d7_KjUannotations) && ((getColor0d7_KjUannotations) radialGradientShader8uybcMk).write) ? false : true, ((Boolean) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{radialGradientShader8uybcMk.write(), getEvenOddRgk1Os.read})).booleanValue());
        } else {
            painterSerializer = null;
        }
        if (painterSerializer == null) {
            painterSerializer = dashpatheffectdefault3.serializer();
        }
        ((onShowTranslationui) asyncImagePainter.MediaSessionCompatResultReceiverWrapper).setValue(painterSerializer);
        if (dashpatheffectdefault2.serializer() != dashpatheffectdefault3.serializer()) {
            objSerializer = dashpatheffectdefault2.serializer();
            if (objSerializer instanceof updateBuffersOnDisappeared) {
                updatebuffersondisappeared = (updateBuffersOnDisappeared) objSerializer;
            } else {
                updatebuffersondisappeared = null;
            }
            if (updatebuffersondisappeared != null) {
                updatebuffersondisappeared.onForgotten();
            }
            Object objSerializer3 = dashpatheffectdefault3.serializer();
            if (objSerializer3 instanceof updateBuffersOnDisappeared) {
            }
            if (updatebuffersondisappeared2 != null) {
                updatebuffersondisappeared2.onRemembered();
            }
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm = asyncImagePainter.ParcelableVolumeInfo;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(dashpatheffectdefault3);
        }
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = read();
            updateBuffersOnDisappeared updatebuffersondisappeared = obj instanceof updateBuffersOnDisappeared ? (updateBuffersOnDisappeared) obj : null;
            if (updatebuffersondisappeared != null) {
                updatebuffersondisappeared.onRemembered();
            }
            IconCompatParcelizer();
            this.MediaSessionCompatQueueItem = true;
        } finally {
            Trace.endSection();
        }
    }

    public final Painter read() {
        return (Painter) this.MediaSessionCompatResultReceiverWrapper.getValue();
    }

    public final void write(PathDirection pathDirection) {
        Object[] objArr = {this.read, pathDirection};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.read = pathDirection;
        if (pathDirection == null) {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.MediaSessionCompatToken;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            }
            this.MediaSessionCompatToken = null;
        } else if (this.MediaSessionCompatQueueItem) {
            IconCompatParcelizer();
        }
        if (pathDirection != null) {
            this.RatingCompat.IconCompatParcelizer(pathDirection);
        }
    }

    public AsyncImagePainter(PathDirection pathDirection) {
        this.read = pathDirection;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(pathDirection);
        this.RatingCompat = mutableStateFlow;
        this.MediaDescriptionCompat = FlowKt.write(mutableStateFlow);
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(PathEffect.serializer);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mutableStateFlow2;
        this.ResultReceiver = FlowKt.write(mutableStateFlow2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        long jMo1304getSizeNHjbRc = drawScope.mo1304getSizeNHjbRc();
        if (!Size.m542equalsimpl0(this.MediaBrowserCompatMediaItem, jMo1304getSizeNHjbRc)) {
            this.MediaBrowserCompatMediaItem = jMo1304getSizeNHjbRc;
        }
        Painter painter = read();
        if (painter != null) {
            painter.m1430drawx_KDEd0(drawScope, drawScope.mo1304getSizeNHjbRc(), this.IconCompatParcelizer, this.write);
        }
    }

    public final void IconCompatParcelizer() {
        PathDirection pathDirection = this.read;
        if (pathDirection == null) {
            return;
        }
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.PlaybackStateCompat;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (getcontentviewgroupparentlayout == null) {
            removeNodeAtDepth.serializer("scope");
            throw null;
        }
        AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(this, pathDirection, shortNewsContentCardView, 0);
        TextAnnouncementContentCardView coroutineContext = getcontentviewgroupparentlayout.getCoroutineContext();
        int i = UtilsKt.write;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.read);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguIconCompatParcelizer = (coroutineDispatcher == null || coroutineDispatcher.equals(prepareForActivityTransitionCarryover.read)) ? BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, prepareForActivityTransitionCarryover.read, CoroutineStart.UNDISPATCHED, asyncImagePainter$launchJob$1) : BuildersKt.IconCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(new reversedefault(getcontentviewgroupparentlayout.getCoroutineContext())), new PathHitTester(coroutineDispatcher), CoroutineStart.UNDISPATCHED, asyncImagePainter$launchJob$1);
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.MediaSessionCompatToken;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.MediaSessionCompatToken = r8lambda7q1qcwxcuhrhcsgrauldg_ksbguIconCompatParcelizer;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.MediaSessionCompatToken;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.MediaSessionCompatToken = null;
        Object obj = read();
        updateBuffersOnDisappeared updatebuffersondisappeared = obj instanceof updateBuffersOnDisappeared ? (updateBuffersOnDisappeared) obj : null;
        if (updatebuffersondisappeared != null) {
            updatebuffersondisappeared.onAbandoned();
        }
        this.MediaSessionCompatQueueItem = false;
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.MediaSessionCompatToken;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.MediaSessionCompatToken = null;
        Object obj = read();
        updateBuffersOnDisappeared updatebuffersondisappeared = obj instanceof updateBuffersOnDisappeared ? (updateBuffersOnDisappeared) obj : null;
        if (updatebuffersondisappeared != null) {
            updatebuffersondisappeared.onForgotten();
        }
        this.MediaSessionCompatQueueItem = false;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1424getIntrinsicSizeNHjbRc() {
        Painter painter = read();
        return painter != null ? painter.mo1424getIntrinsicSizeNHjbRc() : Size.Companion.m554getUnspecifiedNHjbRc();
    }
}
