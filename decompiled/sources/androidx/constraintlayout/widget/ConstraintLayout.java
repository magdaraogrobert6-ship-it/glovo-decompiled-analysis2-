package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.internal.threaddump.RemoteActionCompatParcelizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o.BeyondBoundsLayoutKt;
import o.DrawWithContentElement;
import o.PainterNodemeasure1;
import o.RotateKt;
import o.SimpleInnerShadowElement;
import o.SimpleInnerShadowNode;
import o.calculateScaledSizeE7KxVPU;
import o.getUseIntrinsicSize;
import o.hasSpecifiedAndFiniteHeightuvyYCjk;
import o.innerShadow;
import o.isCanceled;
import o.paintdefault;
import o.resetShadow;
import o.rotate;
import o.scale;
import o.setAlignment;
import o.setPainter;
import o.setSizeToIntrinsics;
import o.shadows4CzXIIdefault;
import o.shadowziNgDLE;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static isCanceled write;
    public final SparseArray ComponentActivity;
    public final ArrayList IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public HashMap MediaMetadataCompat;
    public final getUseIntrinsicSize MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public final Measurer PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public ConstraintSet RatingCompat;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public CardView$1 read;
    public final SparseArray serializer;

    public final class Measurer implements rotate {
        public int IconCompatParcelizer;
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public int RemoteActionCompatParcelizer;
        public int read;
        public final ConstraintLayout serializer;
        public int write;

        @Override // o.rotate
        public final void read() {
            ConstraintLayout constraintLayout = this.serializer;
            ArrayList arrayList = constraintLayout.IconCompatParcelizer;
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                constraintLayout.getChildAt(i);
            }
            int size = arrayList.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) arrayList.get(i2)).getClass();
                }
            }
        }

        public Measurer(ConstraintLayout constraintLayout) {
            this.serializer = constraintLayout;
        }

        public static boolean write(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:110:0x0196  */
        /* JADX WARN: Code duplicated, block: B:111:0x0198  */
        /* JADX WARN: Code duplicated, block: B:113:0x019b  */
        /* JADX WARN: Code duplicated, block: B:114:0x019d  */
        /* JADX WARN: Code duplicated, block: B:121:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:127:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:133:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:138:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:140:0x01cd A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:141:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:152:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:154:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:157:0x0201  */
        /* JADX WARN: Code duplicated, block: B:160:0x021b  */
        /* JADX WARN: Code duplicated, block: B:161:0x0220  */
        /* JADX WARN: Code duplicated, block: B:164:0x0225  */
        /* JADX WARN: Code duplicated, block: B:167:0x022d  */
        /* JADX WARN: Code duplicated, block: B:168:0x0234  */
        /* JADX WARN: Code duplicated, block: B:171:0x023b  */
        /* JADX WARN: Code duplicated, block: B:174:0x0248  */
        /* JADX WARN: Code duplicated, block: B:176:0x024c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:178:0x0256 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:179:0x0258 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:182:0x0263 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:185:0x026a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:186:0x026c  */
        /* JADX WARN: Code duplicated, block: B:187:0x0273  */
        /* JADX WARN: Code duplicated, block: B:189:0x0277  */
        /* JADX WARN: Code duplicated, block: B:190:0x027c  */
        /* JADX WARN: Code duplicated, block: B:193:0x029a  */
        /* JADX WARN: Code duplicated, block: B:194:0x029c  */
        /* JADX WARN: Code duplicated, block: B:201:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:204:0x02af  */
        /* JADX WARN: Code duplicated, block: B:205:0x02b1  */
        @Override // o.rotate
        public final void measure(setAlignment setalignment, RotateKt rotateKt) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int childMeasureSpec;
            getUseIntrinsicSize getuseintrinsicsize;
            ConstraintLayout constraintLayout;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk;
            boolean z;
            boolean z2;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            shadows4CzXIIdefault shadows4czxiidefault;
            int i;
            int measuredWidth;
            int measuredHeight;
            int i2;
            int measuredWidth2;
            int i3;
            int i4;
            int measuredHeight2;
            int i5;
            int i6;
            int iMakeMeasureSpec3;
            boolean z7;
            int baseline;
            int i7;
            boolean z8;
            boolean z9;
            boolean z10;
            int childMeasureSpec2;
            if (setalignment == null) {
                return;
            }
            paintdefault paintdefaultVar = setalignment.invalidateMenu;
            paintdefault paintdefaultVar2 = setalignment.onBackPressedDispatcher_delegatelambda010;
            if (setalignment.onMultiWindowModeChanged == 8) {
                rotateKt.RatingCompat = 0;
                rotateKt.MediaDescriptionCompat = 0;
                rotateKt.serializer = 0;
                return;
            }
            if (setalignment.getViewModelStore == null) {
                return;
            }
            isCanceled iscanceled = ConstraintLayout.write;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = rotateKt.read;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = rotateKt.MediaBrowserCompatMediaItem;
            int i8 = rotateKt.IconCompatParcelizer;
            int i9 = rotateKt.MediaMetadataCompat;
            int i10 = this.MediaMetadataCompat + this.write;
            int i11 = this.MediaDescriptionCompat;
            View view = (View) setalignment._init_lambda3;
            int[] iArr = innerShadow.RemoteActionCompatParcelizer;
            int i12 = iArr[hasspecifiedandfiniteheightuvyycjk3.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.IconCompatParcelizer, i11, -2);
                } else if (i12 == 3) {
                    int i13 = this.IconCompatParcelizer;
                    int i14 = paintdefaultVar2 != null ? paintdefaultVar2.IconCompatParcelizer : 0;
                    if (paintdefaultVar != null) {
                        i14 += paintdefaultVar.IconCompatParcelizer;
                    }
                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, i11 + i14, -1);
                } else if (i12 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.IconCompatParcelizer, i11, -2);
                    boolean z11 = setalignment.addOnConfigurationChangedListener == 1;
                    int i15 = rotateKt.RemoteActionCompatParcelizer;
                    if (i15 == 1 || i15 == 2) {
                        boolean z12 = view.getMeasuredHeight() == setalignment.MediaDescriptionCompat();
                        if (rotateKt.RemoteActionCompatParcelizer == 2 || !z11 || ((z11 && z12) || setalignment.j_())) {
                            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(setalignment.MediaSessionCompatQueueItem(), 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = childMeasureSpec2;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            }
            int i16 = iArr[hasspecifiedandfiniteheightuvyycjk4.ordinal()];
            if (i16 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else {
                if (i16 == 2) {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.RemoteActionCompatParcelizer, i10, -2);
                } else if (i16 == 3) {
                    int i17 = this.RemoteActionCompatParcelizer;
                    int i18 = paintdefaultVar2 != null ? setalignment.onActivityResult.IconCompatParcelizer : 0;
                    if (paintdefaultVar != null) {
                        i18 += setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i10 + i18, -1);
                } else if (i16 != 4) {
                    childMeasureSpec = 0;
                } else {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.RemoteActionCompatParcelizer, i10, -2);
                    boolean z13 = setalignment.addMenuProvider == 1;
                    int i19 = rotateKt.RemoteActionCompatParcelizer;
                    if (i19 == 1 || i19 == 2) {
                        boolean z14 = view.getMeasuredWidth() == setalignment.MediaSessionCompatQueueItem();
                        if (rotateKt.RemoteActionCompatParcelizer == 2 || !z13 || ((z13 && z14) || setalignment.RemoteActionCompatParcelizer())) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(setalignment.MediaDescriptionCompat(), 1073741824);
                        }
                    }
                }
                getuseintrinsicsize = setalignment.getViewModelStore;
                constraintLayout = ConstraintLayout.this;
                if (getuseintrinsicsize == null && PainterNodemeasure1.serializer(constraintLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, Fields.RotationX) && view.getMeasuredWidth() == setalignment.MediaSessionCompatQueueItem() && view.getMeasuredWidth() < getuseintrinsicsize.MediaSessionCompatQueueItem() && view.getMeasuredHeight() == setalignment.MediaDescriptionCompat() && view.getMeasuredHeight() < getuseintrinsicsize.MediaDescriptionCompat() && view.getBaseline() == setalignment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ && !setalignment.PlaybackStateCompat() && write(setalignment.onBackPressedInput_delegatelambda0, iMakeMeasureSpec, setalignment.MediaSessionCompatQueueItem()) && write(setalignment.onBackPressedDispatcher_delegatelambda00, childMeasureSpec, setalignment.MediaDescriptionCompat())) {
                    rotateKt.RatingCompat = setalignment.MediaSessionCompatQueueItem();
                    rotateKt.MediaDescriptionCompat = setalignment.MediaDescriptionCompat();
                    rotateKt.serializer = setalignment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                    return;
                }
                hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk) {
                    z = true;
                } else {
                    z = false;
                }
                if (hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT;
                if (hasspecifiedandfiniteheightuvyycjk4 != hasspecifiedandfiniteheightuvyycjk2 || hasspecifiedandfiniteheightuvyycjk4 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (hasspecifiedandfiniteheightuvyycjk3 != hasspecifiedandfiniteheightuvyycjk2 || hasspecifiedandfiniteheightuvyycjk3 == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z || setalignment.createFullyDrawnExecutor <= 0.0f) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || setalignment.createFullyDrawnExecutor <= 0.0f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (view == null) {
                    return;
                }
                shadows4czxiidefault = (shadows4CzXIIdefault) view.getLayoutParams();
                i = rotateKt.RemoteActionCompatParcelizer;
                if (i == 1 && i != 2 && z && setalignment.addOnConfigurationChangedListener == 0 && z2 && setalignment.addMenuProvider == 0) {
                    baseline = 0;
                    i7 = -1;
                    z7 = false;
                    measuredWidth2 = 0;
                    measuredHeight2 = 0;
                } else {
                    if (!(view instanceof VirtualLayout) && (setalignment instanceof scale)) {
                        ((VirtualLayout) view).write((scale) setalignment, iMakeMeasureSpec, childMeasureSpec);
                    } else {
                        view.measure(iMakeMeasureSpec, childMeasureSpec);
                    }
                    setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                    setalignment.onBackPressedDispatcher_delegatelambda00 = childMeasureSpec;
                    setalignment.getDefaultViewModelProviderFactory = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    i2 = setalignment.addOnTrimMemoryListener;
                    if (i2 > 0) {
                        measuredWidth2 = Math.max(i2, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i3 = setalignment.addOnPictureInPictureUiStateChangedListener;
                    if (i3 > 0) {
                        measuredWidth2 = Math.min(i3, measuredWidth2);
                    }
                    i4 = setalignment.enterPictureInPictureMode;
                    if (i4 > 0) {
                        measuredHeight2 = Math.max(i4, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i5 = setalignment.addOnPictureInPictureModeChangedListener;
                    if (i5 > 0) {
                        measuredHeight2 = Math.min(i5, measuredHeight2);
                    }
                    if (!PainterNodemeasure1.serializer(constraintLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, 1)) {
                        if (!z5 && z3) {
                            measuredWidth2 = (int) ((measuredHeight2 * setalignment.createFullyDrawnExecutor) + 0.5f);
                        } else if (z6 && z4) {
                            measuredHeight2 = (int) ((measuredWidth2 / setalignment.createFullyDrawnExecutor) + 0.5f);
                        }
                    }
                    if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        } else {
                            iMakeMeasureSpec3 = childMeasureSpec;
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                        setalignment.onBackPressedDispatcher_delegatelambda00 = iMakeMeasureSpec3;
                        z7 = false;
                        setalignment.getDefaultViewModelProviderFactory = false;
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        i7 = -1;
                    } else {
                        baseline = baseline2;
                        i7 = -1;
                        z7 = false;
                    }
                }
                if (baseline != i7) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (measuredWidth2 == rotateKt.IconCompatParcelizer || measuredHeight2 != rotateKt.MediaMetadataCompat) {
                    z9 = true;
                } else {
                    z9 = z7;
                }
                rotateKt.MediaSessionCompatQueueItem = z9;
                if (shadows4czxiidefault.defaultViewModelProviderFactory_delegatelambda0) {
                    z10 = true;
                } else {
                    z10 = z8;
                }
                if (z10 && baseline != -1 && setalignment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != baseline) {
                    rotateKt.MediaSessionCompatQueueItem = true;
                }
                rotateKt.RatingCompat = measuredWidth2;
                rotateKt.MediaDescriptionCompat = measuredHeight2;
                rotateKt.write = z10;
                rotateKt.serializer = baseline;
            }
            childMeasureSpec = iMakeMeasureSpec2;
            getuseintrinsicsize = setalignment.getViewModelStore;
            constraintLayout = ConstraintLayout.this;
            if (getuseintrinsicsize == null) {
            }
            hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
            if (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk) {
                z = true;
            } else {
                z = false;
            }
            if (hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk) {
                z2 = true;
            } else {
                z2 = false;
            }
            hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT;
            if (hasspecifiedandfiniteheightuvyycjk4 != hasspecifiedandfiniteheightuvyycjk2) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (hasspecifiedandfiniteheightuvyycjk3 != hasspecifiedandfiniteheightuvyycjk2) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z2) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (view == null) {
                return;
            }
            shadows4czxiidefault = (shadows4CzXIIdefault) view.getLayoutParams();
            i = rotateKt.RemoteActionCompatParcelizer;
            if (i == 1) {
                if (!(view instanceof VirtualLayout)) {
                    view.measure(iMakeMeasureSpec, childMeasureSpec);
                } else {
                    view.measure(iMakeMeasureSpec, childMeasureSpec);
                }
                setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                setalignment.onBackPressedDispatcher_delegatelambda00 = childMeasureSpec;
                setalignment.getDefaultViewModelProviderFactory = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline3 = view.getBaseline();
                i2 = setalignment.addOnTrimMemoryListener;
                if (i2 > 0) {
                    measuredWidth2 = Math.max(i2, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i3 = setalignment.addOnPictureInPictureUiStateChangedListener;
                if (i3 > 0) {
                    measuredWidth2 = Math.min(i3, measuredWidth2);
                }
                i4 = setalignment.enterPictureInPictureMode;
                if (i4 > 0) {
                    measuredHeight2 = Math.max(i4, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i5 = setalignment.addOnPictureInPictureModeChangedListener;
                if (i5 > 0) {
                    measuredHeight2 = Math.min(i5, measuredHeight2);
                }
                if (!PainterNodemeasure1.serializer(constraintLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, 1)) {
                    if (!z5) {
                        if (z6) {
                            measuredHeight2 = (int) ((measuredWidth2 / setalignment.createFullyDrawnExecutor) + 0.5f);
                        }
                    } else if (z6) {
                        measuredHeight2 = (int) ((measuredWidth2 / setalignment.createFullyDrawnExecutor) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    } else {
                        iMakeMeasureSpec3 = childMeasureSpec;
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                    setalignment.onBackPressedDispatcher_delegatelambda00 = iMakeMeasureSpec3;
                    z7 = false;
                    setalignment.getDefaultViewModelProviderFactory = false;
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i7 = -1;
                } else {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    } else {
                        iMakeMeasureSpec3 = childMeasureSpec;
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                    setalignment.onBackPressedDispatcher_delegatelambda00 = iMakeMeasureSpec3;
                    z7 = false;
                    setalignment.getDefaultViewModelProviderFactory = false;
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i7 = -1;
                }
            } else {
                if (!(view instanceof VirtualLayout)) {
                    view.measure(iMakeMeasureSpec, childMeasureSpec);
                } else {
                    view.measure(iMakeMeasureSpec, childMeasureSpec);
                }
                setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                setalignment.onBackPressedDispatcher_delegatelambda00 = childMeasureSpec;
                setalignment.getDefaultViewModelProviderFactory = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline4 = view.getBaseline();
                i2 = setalignment.addOnTrimMemoryListener;
                if (i2 > 0) {
                    measuredWidth2 = Math.max(i2, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i3 = setalignment.addOnPictureInPictureUiStateChangedListener;
                if (i3 > 0) {
                    measuredWidth2 = Math.min(i3, measuredWidth2);
                }
                i4 = setalignment.enterPictureInPictureMode;
                if (i4 > 0) {
                    measuredHeight2 = Math.max(i4, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i5 = setalignment.addOnPictureInPictureModeChangedListener;
                if (i5 > 0) {
                    measuredHeight2 = Math.min(i5, measuredHeight2);
                }
                if (!PainterNodemeasure1.serializer(constraintLayout.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, 1)) {
                    if (!z5) {
                        if (z6) {
                            measuredHeight2 = (int) ((measuredWidth2 / setalignment.createFullyDrawnExecutor) + 0.5f);
                        }
                    } else if (z6) {
                        measuredHeight2 = (int) ((measuredWidth2 / setalignment.createFullyDrawnExecutor) + 0.5f);
                    }
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    } else {
                        iMakeMeasureSpec3 = childMeasureSpec;
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                    setalignment.onBackPressedDispatcher_delegatelambda00 = iMakeMeasureSpec3;
                    z7 = false;
                    setalignment.getDefaultViewModelProviderFactory = false;
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i7 = -1;
                } else {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    } else {
                        iMakeMeasureSpec3 = childMeasureSpec;
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    setalignment.onBackPressedInput_delegatelambda0 = iMakeMeasureSpec;
                    setalignment.onBackPressedDispatcher_delegatelambda00 = iMakeMeasureSpec3;
                    z7 = false;
                    setalignment.getDefaultViewModelProviderFactory = false;
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i7 = -1;
                }
            }
            if (baseline != i7) {
                z8 = true;
            } else {
                z8 = z7;
            }
            if (measuredWidth2 == rotateKt.IconCompatParcelizer) {
                z9 = true;
            } else {
                z9 = true;
            }
            rotateKt.MediaSessionCompatQueueItem = z9;
            if (shadows4czxiidefault.defaultViewModelProviderFactory_delegatelambda0) {
                z10 = true;
            } else {
                z10 = z8;
            }
            if (z10) {
                rotateKt.MediaSessionCompatQueueItem = true;
            }
            rotateKt.RatingCompat = measuredWidth2;
            rotateKt.MediaDescriptionCompat = measuredHeight2;
            rotateKt.write = z10;
            rotateKt.serializer = baseline;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof shadows4CzXIIdefault;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.MediaDescriptionCompat = true;
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.PlaybackStateCompatCustomAction;
    }

    public int getMaxWidth() {
        return this.ParcelableVolumeInfo;
    }

    public int getMinHeight() {
        return this.MediaSessionCompatToken;
    }

    public int getMinWidth() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.MediaDescriptionCompat = true;
        super.requestLayout();
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.RatingCompat = constraintSet;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        shadows4CzXIIdefault shadows4czxiidefault = new shadows4CzXIIdefault(context, attributeSet);
        shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
        shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = -1;
        shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = -1.0f;
        shadows4czxiidefault.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        shadows4czxiidefault._init_lambda2 = -1;
        shadows4czxiidefault._init_lambda1 = -1;
        shadows4czxiidefault.enterPictureInPictureMode = -1;
        shadows4czxiidefault.addOnUserLeaveHintListener = -1;
        shadows4czxiidefault.getDefaultViewModelCreationExtras = -1;
        shadows4czxiidefault.getDefaultViewModelProviderFactory = -1;
        shadows4czxiidefault.MediaDescriptionCompat = -1;
        shadows4czxiidefault.RemoteActionCompatParcelizer = -1;
        shadows4czxiidefault.read = -1;
        shadows4czxiidefault.IconCompatParcelizer = -1;
        shadows4czxiidefault.write = -1;
        shadows4czxiidefault.RatingCompat = -1;
        shadows4czxiidefault.MediaBrowserCompatMediaItem = 0;
        shadows4czxiidefault.MediaMetadataCompat = 0.0f;
        shadows4czxiidefault.getActivityResultRegistry = -1;
        shadows4czxiidefault.getFullyDrawnReporter = -1;
        shadows4czxiidefault.ResultReceiver = -1;
        shadows4czxiidefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
        shadows4czxiidefault.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Integer.MIN_VALUE;
        shadows4czxiidefault.ComponentActivity = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Integer.MIN_VALUE;
        shadows4czxiidefault.serializer = 0;
        shadows4czxiidefault.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 0.5f;
        shadows4czxiidefault.getLastCustomNonConfigurationInstance = 0.5f;
        shadows4czxiidefault.MediaSessionCompatResultReceiverWrapper = null;
        shadows4czxiidefault._init_lambda3 = -1.0f;
        shadows4czxiidefault.getSavedStateRegistry = -1.0f;
        shadows4czxiidefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 0;
        shadows4czxiidefault.getOnBackPressedDispatcher = 0;
        shadows4czxiidefault.addOnMultiWindowModeChangedListener = 0;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda010 = 0;
        shadows4czxiidefault.addOnConfigurationChangedListener = 0;
        shadows4czxiidefault.addOnNewIntentListener = 0;
        shadows4czxiidefault.addMenuProvider = 0;
        shadows4czxiidefault.addOnContextAvailableListener = 0;
        shadows4czxiidefault.addOnTrimMemoryListener = 1.0f;
        shadows4czxiidefault.addOnPictureInPictureUiStateChangedListener = 1.0f;
        shadows4czxiidefault.PlaybackStateCompat = -1;
        shadows4czxiidefault.ParcelableVolumeInfo = -1;
        shadows4czxiidefault.addOnPictureInPictureModeChangedListener = -1;
        shadows4czxiidefault.MediaSessionCompatToken = false;
        shadows4czxiidefault.MediaSessionCompatQueueItem = false;
        shadows4czxiidefault.PlaybackStateCompatCustomAction = null;
        shadows4czxiidefault.getViewModelStore = 0;
        shadows4czxiidefault._init_lambda4 = true;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda00 = true;
        shadows4czxiidefault.defaultViewModelProviderFactory_delegatelambda0 = false;
        shadows4czxiidefault.accessensureViewModelStore = false;
        shadows4czxiidefault.createFullyDrawnExecutor = false;
        shadows4czxiidefault.getOnBackPressedInput = -1;
        shadows4czxiidefault.fullyDrawnReporter_delegatelambda0 = -1;
        shadows4czxiidefault.addContentView = -1;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda0 = -1;
        shadows4czxiidefault.addObserverForBackInvokerlambda0 = Integer.MIN_VALUE;
        shadows4czxiidefault.addObserverForBackInvoker = Integer.MIN_VALUE;
        shadows4czxiidefault.getSavedStateRegistryControllerannotations = 0.5f;
        shadows4czxiidefault.onBackPressedInput_delegatelambda0 = new setAlignment();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.ConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = shadowziNgDLE.serializer.get(index);
            switch (i2) {
                case 1:
                    shadows4czxiidefault.addOnPictureInPictureModeChangedListener = typedArrayObtainStyledAttributes.getInt(index, shadows4czxiidefault.addOnPictureInPictureModeChangedListener);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.RatingCompat);
                    shadows4czxiidefault.RatingCompat = resourceId;
                    if (resourceId == -1) {
                        shadows4czxiidefault.RatingCompat = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    shadows4czxiidefault.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.MediaBrowserCompatMediaItem);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.MediaMetadataCompat) % 360.0f;
                    shadows4czxiidefault.MediaMetadataCompat = f;
                    if (f < 0.0f) {
                        shadows4czxiidefault.MediaMetadataCompat = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    break;
                case 6:
                    shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                    break;
                case 7:
                    shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault._init_lambda2);
                    shadows4czxiidefault._init_lambda2 = resourceId2;
                    if (resourceId2 == -1) {
                        shadows4czxiidefault._init_lambda2 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault._init_lambda1);
                    shadows4czxiidefault._init_lambda1 = resourceId3;
                    if (resourceId3 == -1) {
                        shadows4czxiidefault._init_lambda1 = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.enterPictureInPictureMode);
                    shadows4czxiidefault.enterPictureInPictureMode = resourceId4;
                    if (resourceId4 == -1) {
                        shadows4czxiidefault.enterPictureInPictureMode = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.addOnUserLeaveHintListener);
                    shadows4czxiidefault.addOnUserLeaveHintListener = resourceId5;
                    if (resourceId5 == -1) {
                        shadows4czxiidefault.addOnUserLeaveHintListener = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.getDefaultViewModelCreationExtras);
                    shadows4czxiidefault.getDefaultViewModelCreationExtras = resourceId6;
                    if (resourceId6 == -1) {
                        shadows4czxiidefault.getDefaultViewModelCreationExtras = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.getDefaultViewModelProviderFactory);
                    shadows4czxiidefault.getDefaultViewModelProviderFactory = resourceId7;
                    if (resourceId7 == -1) {
                        shadows4czxiidefault.getDefaultViewModelProviderFactory = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.MediaDescriptionCompat);
                    shadows4czxiidefault.MediaDescriptionCompat = resourceId8;
                    if (resourceId8 == -1) {
                        shadows4czxiidefault.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.RemoteActionCompatParcelizer);
                    shadows4czxiidefault.RemoteActionCompatParcelizer = resourceId9;
                    if (resourceId9 == -1) {
                        shadows4czxiidefault.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.read);
                    shadows4czxiidefault.read = resourceId10;
                    if (resourceId10 == -1) {
                        shadows4czxiidefault.read = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.getActivityResultRegistry);
                    shadows4czxiidefault.getActivityResultRegistry = resourceId11;
                    if (resourceId11 == -1) {
                        shadows4czxiidefault.getActivityResultRegistry = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.getFullyDrawnReporter);
                    shadows4czxiidefault.getFullyDrawnReporter = resourceId12;
                    if (resourceId12 == -1) {
                        shadows4czxiidefault.getFullyDrawnReporter = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.ResultReceiver);
                    shadows4czxiidefault.ResultReceiver = resourceId13;
                    if (resourceId13 == -1) {
                        shadows4czxiidefault.ResultReceiver = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    shadows4czxiidefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = resourceId14;
                    if (resourceId14 == -1) {
                        shadows4czxiidefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    shadows4czxiidefault.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                    break;
                case 22:
                    shadows4czxiidefault.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                    break;
                case 23:
                    shadows4czxiidefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                    break;
                case 24:
                    shadows4czxiidefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    break;
                case 25:
                    shadows4czxiidefault.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    break;
                case 26:
                    shadows4czxiidefault.ComponentActivity = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.ComponentActivity);
                    break;
                case 27:
                    shadows4czxiidefault.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getBoolean(index, shadows4czxiidefault.MediaSessionCompatToken);
                    break;
                case 28:
                    shadows4czxiidefault.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getBoolean(index, shadows4czxiidefault.MediaSessionCompatQueueItem);
                    break;
                case 29:
                    shadows4czxiidefault.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                    break;
                case 30:
                    shadows4czxiidefault.getLastCustomNonConfigurationInstance = typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.getLastCustomNonConfigurationInstance);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    shadows4czxiidefault.addOnMultiWindowModeChangedListener = i3;
                    if (i3 == 1) {
                        SentryLogcatAdapter.serializer("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    shadows4czxiidefault.onBackPressedDispatcher_delegatelambda010 = i4;
                    if (i4 == 1) {
                        SentryLogcatAdapter.serializer("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        shadows4czxiidefault.addOnConfigurationChangedListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.addOnConfigurationChangedListener);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, shadows4czxiidefault.addOnConfigurationChangedListener) == -2) {
                            shadows4czxiidefault.addOnConfigurationChangedListener = -2;
                        }
                    }
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    try {
                        shadows4czxiidefault.addMenuProvider = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.addMenuProvider);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, shadows4czxiidefault.addMenuProvider) == -2) {
                            shadows4czxiidefault.addMenuProvider = -2;
                        }
                    }
                    break;
                case 35:
                    shadows4czxiidefault.addOnTrimMemoryListener = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.addOnTrimMemoryListener));
                    shadows4czxiidefault.addOnMultiWindowModeChangedListener = 2;
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    try {
                        shadows4czxiidefault.addOnNewIntentListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.addOnNewIntentListener);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, shadows4czxiidefault.addOnNewIntentListener) == -2) {
                            shadows4czxiidefault.addOnNewIntentListener = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        shadows4czxiidefault.addOnContextAvailableListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.addOnContextAvailableListener);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, shadows4czxiidefault.addOnContextAvailableListener) == -2) {
                            shadows4czxiidefault.addOnContextAvailableListener = -2;
                        }
                    }
                    break;
                case 38:
                    shadows4czxiidefault.addOnPictureInPictureUiStateChangedListener = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.addOnPictureInPictureUiStateChangedListener));
                    shadows4czxiidefault.onBackPressedDispatcher_delegatelambda010 = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            ConstraintSet.serializer(shadows4czxiidefault, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            shadows4czxiidefault._init_lambda3 = typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault._init_lambda3);
                            break;
                        case 46:
                            shadows4czxiidefault.getSavedStateRegistry = typedArrayObtainStyledAttributes.getFloat(index, shadows4czxiidefault.getSavedStateRegistry);
                            break;
                        case 47:
                            shadows4czxiidefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                            shadows4czxiidefault.getOnBackPressedDispatcher = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            shadows4czxiidefault.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, shadows4czxiidefault.PlaybackStateCompat);
                            break;
                        case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                            shadows4czxiidefault.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, shadows4czxiidefault.ParcelableVolumeInfo);
                            break;
                        case 51:
                            shadows4czxiidefault.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.IconCompatParcelizer);
                            shadows4czxiidefault.IconCompatParcelizer = resourceId15;
                            if (resourceId15 == -1) {
                                shadows4czxiidefault.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, shadows4czxiidefault.write);
                            shadows4czxiidefault.write = resourceId16;
                            if (resourceId16 == -1) {
                                shadows4czxiidefault.write = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            shadows4czxiidefault.serializer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.serializer);
                            break;
                        case 55:
                            shadows4czxiidefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, shadows4czxiidefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    ConstraintSet.read(shadows4czxiidefault, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    ConstraintSet.read(shadows4czxiidefault, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    shadows4czxiidefault.getViewModelStore = typedArrayObtainStyledAttributes.getInt(index, shadows4czxiidefault.getViewModelStore);
                                    break;
                                case 67:
                                    shadows4czxiidefault.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = typedArrayObtainStyledAttributes.getBoolean(index, shadows4czxiidefault.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        shadows4czxiidefault.RemoteActionCompatParcelizer();
        return shadows4czxiidefault;
    }

    public int getOptimizationLevel() {
        return this.MediaSessionCompatQueueItem.PlaybackStateCompatCustomAction;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        getUseIntrinsicSize getuseintrinsicsize = this.MediaSessionCompatQueueItem;
        if (getuseintrinsicsize.onSaveInstanceState == null) {
            int id2 = getId();
            if (id2 != -1) {
                getuseintrinsicsize.onSaveInstanceState = getContext().getResources().getResourceEntryName(id2);
            } else {
                getuseintrinsicsize.onSaveInstanceState = "parent";
            }
        }
        if (getuseintrinsicsize.accessensureViewModelStore == null) {
            getuseintrinsicsize.accessensureViewModelStore = getuseintrinsicsize.onSaveInstanceState;
        }
        for (setAlignment setalignment : getuseintrinsicsize.serializer) {
            View view = (View) setalignment._init_lambda3;
            if (view != null) {
                if (setalignment.onSaveInstanceState == null && (id = view.getId()) != -1) {
                    setalignment.onSaveInstanceState = getContext().getResources().getResourceEntryName(id);
                }
                if (setalignment.accessensureViewModelStore == null) {
                    setalignment.accessensureViewModelStore = setalignment.onSaveInstanceState;
                }
            }
        }
        getuseintrinsicsize.serializer(sb);
        return sb.toString();
    }

    public final setAlignment getViewWidget(View view) {
        if (view == this) {
            return this.MediaSessionCompatQueueItem;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof shadows4CzXIIdefault) {
            return ((shadows4CzXIIdefault) view.getLayoutParams()).onBackPressedInput_delegatelambda0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof shadows4CzXIIdefault) {
            return ((shadows4CzXIIdefault) view.getLayoutParams()).onBackPressedInput_delegatelambda0;
        }
        return null;
    }

    public final void init(AttributeSet attributeSet, int i) {
        getUseIntrinsicSize getuseintrinsicsize = this.MediaSessionCompatQueueItem;
        getuseintrinsicsize._init_lambda3 = this;
        Measurer measurer = this.PlaybackStateCompat;
        getuseintrinsicsize.MediaSessionCompatResultReceiverWrapper = measurer;
        getuseintrinsicsize.write.MediaSessionCompatQueueItem = measurer;
        this.serializer.put(getId(), this);
        this.RatingCompat = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.ConstraintLayout_Layout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaSessionCompatResultReceiverWrapper);
                } else if (index == 17) {
                    this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaSessionCompatToken);
                } else if (index == 14) {
                    this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ParcelableVolumeInfo);
                } else if (index == 15) {
                    this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.PlaybackStateCompatCustomAction);
                } else if (index == 113) {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typedArrayObtainStyledAttributes.getInt(index, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.read = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.RatingCompat = constraintSet;
                        constraintSet.RemoteActionCompatParcelizer(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.RatingCompat = null;
                    }
                    this.MediaBrowserCompatMediaItem = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        getuseintrinsicsize.PlaybackStateCompatCustomAction = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        DrawWithContentElement.write = getuseintrinsicsize.RemoteActionCompatParcelizer(Fields.RotationY);
    }

    public final void parseLayoutDescription(int i) {
        String str;
        Context context = getContext();
        CardView$1 cardView$1 = new CardView$1(7, false);
        cardView$1.RemoteActionCompatParcelizer = new SparseArray();
        cardView$1.IconCompatParcelizer = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                cardView$1.read(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(context, xml);
                                ((SparseArray) cardView$1.RemoteActionCompatParcelizer).put(remoteActionCompatParcelizer2.RemoteActionCompatParcelizer, remoteActionCompatParcelizer2);
                                remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                resetShadow resetshadow = new resetShadow(context, xml);
                                if (remoteActionCompatParcelizer != null) {
                                    remoteActionCompatParcelizer.IconCompatParcelizer(resetshadow);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            SentryLogcatAdapter.read("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            SentryLogcatAdapter.read("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.read = cardView$1;
    }

    public void setOptimizationLevel(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        getUseIntrinsicSize getuseintrinsicsize = this.MediaSessionCompatQueueItem;
        getuseintrinsicsize.PlaybackStateCompatCustomAction = i;
        DrawWithContentElement.write = getuseintrinsicsize.RemoteActionCompatParcelizer(Fields.RotationY);
    }

    public final void setWidgetBaseline(setAlignment setalignment, shadows4CzXIIdefault shadows4czxiidefault, SparseArray sparseArray, int i, calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu) {
        View view = (View) this.serializer.get(i);
        setAlignment setalignment2 = (setAlignment) sparseArray.get(i);
        if (setalignment2 == null || view == null || !(view.getLayoutParams() instanceof shadows4CzXIIdefault)) {
            return;
        }
        shadows4czxiidefault.defaultViewModelProviderFactory_delegatelambda0 = true;
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu2 = calculateScaledSizeE7KxVPU.BASELINE;
        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu2) {
            shadows4CzXIIdefault shadows4czxiidefault2 = (shadows4CzXIIdefault) view.getLayoutParams();
            shadows4czxiidefault2.defaultViewModelProviderFactory_delegatelambda0 = true;
            shadows4czxiidefault2.onBackPressedInput_delegatelambda0.addObserverForBackInvokerlambda0 = true;
        }
        setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2).IconCompatParcelizer(setalignment2.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu), shadows4czxiidefault.serializer, shadows4czxiidefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, true);
        setalignment.addObserverForBackInvokerlambda0 = true;
        setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP).RatingCompat();
        setalignment.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM).RatingCompat();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.IconCompatParcelizer;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ConstraintHelper) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new shadows4CzXIIdefault(-2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        setAlignment viewWidget = getViewWidget(view);
        if ((view instanceof SimpleInnerShadowElement) && !(viewWidget instanceof setSizeToIntrinsics)) {
            shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) view.getLayoutParams();
            setSizeToIntrinsics setsizetointrinsics = new setSizeToIntrinsics();
            shadows4czxiidefault.onBackPressedInput_delegatelambda0 = setsizetointrinsics;
            shadows4czxiidefault.accessensureViewModelStore = true;
            setsizetointrinsics.RemoteActionCompatParcelizer(shadows4czxiidefault.addOnPictureInPictureModeChangedListener);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.RemoteActionCompatParcelizer();
            ((shadows4CzXIIdefault) view.getLayoutParams()).createFullyDrawnExecutor = true;
            ArrayList arrayList = this.IconCompatParcelizer;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.serializer.put(view.getId(), view);
        this.MediaDescriptionCompat = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.serializer.remove(view.getId());
        setAlignment viewWidget = getViewWidget(view);
        this.MediaSessionCompatQueueItem.serializer.remove(viewWidget);
        viewWidget.MediaSessionCompatResultReceiverWrapper();
        this.IconCompatParcelizer.remove(view);
        this.MediaDescriptionCompat = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) childAt.getLayoutParams();
            setAlignment setalignment = shadows4czxiidefault.onBackPressedInput_delegatelambda0;
            if (childAt.getVisibility() != 8 || shadows4czxiidefault.accessensureViewModelStore || shadows4czxiidefault.createFullyDrawnExecutor || zIsInEditMode) {
                int iRatingCompat = setalignment.RatingCompat();
                int iMediaSessionCompatToken = setalignment.MediaSessionCompatToken();
                childAt.layout(iRatingCompat, iMediaSessionCompatToken, setalignment.MediaSessionCompatQueueItem() + iRatingCompat, setalignment.MediaDescriptionCompat() + iMediaSessionCompatToken);
            }
        }
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) arrayList.get(i6)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.serializer;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setOnConstraintsChanged(SimpleInnerShadowNode simpleInnerShadowNode) {
        CardView$1 cardView$1 = this.read;
        if (cardView$1 != null) {
            cardView$1.getClass();
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.serializer = new SparseArray();
        this.IconCompatParcelizer = new ArrayList(4);
        this.MediaSessionCompatQueueItem = new getUseIntrinsicSize();
        this.MediaSessionCompatResultReceiverWrapper = 0;
        this.MediaSessionCompatToken = 0;
        this.ParcelableVolumeInfo = Integer.MAX_VALUE;
        this.PlaybackStateCompatCustomAction = Integer.MAX_VALUE;
        this.MediaDescriptionCompat = true;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 257;
        this.RatingCompat = null;
        this.read = null;
        this.MediaBrowserCompatMediaItem = -1;
        this.MediaMetadataCompat = new HashMap();
        this.ComponentActivity = new SparseArray();
        this.PlaybackStateCompat = new Measurer(this);
        init(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingRight());
        int iMax3 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax3 > 0 ? iMax3 : iMax2 + iMax;
    }

    public void setMaxHeight(int i) {
        if (i == this.PlaybackStateCompatCustomAction) {
            return;
        }
        this.PlaybackStateCompatCustomAction = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.ParcelableVolumeInfo) {
            return;
        }
        this.ParcelableVolumeInfo = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.MediaSessionCompatToken) {
            return;
        }
        this.MediaSessionCompatToken = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = i;
        requestLayout();
    }

    public static isCanceled getSharedValues() {
        if (write == null) {
            write = new isCanceled();
        }
        return write;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:159:0x0303  */
    /* JADX WARN: Code duplicated, block: B:166:0x0328  */
    /* JADX WARN: Code duplicated, block: B:168:0x0332  */
    /* JADX WARN: Code duplicated, block: B:169:0x0344  */
    /* JADX WARN: Code duplicated, block: B:176:0x0369  */
    /* JADX WARN: Code duplicated, block: B:177:0x0377  */
    /* JADX WARN: Code duplicated, block: B:179:0x037d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:185:0x039b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:245:0x0526 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x0528  */
    /* JADX WARN: Code duplicated, block: B:248:0x052c  */
    /* JADX WARN: Code duplicated, block: B:249:0x0531  */
    /* JADX WARN: Code duplicated, block: B:250:0x053d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0541  */
    /* JADX WARN: Code duplicated, block: B:253:0x054f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0556  */
    /* JADX WARN: Code duplicated, block: B:256:0x055d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0566  */
    /* JADX WARN: Code duplicated, block: B:261:0x0574 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:262:0x0576  */
    /* JADX WARN: Code duplicated, block: B:264:0x057a  */
    /* JADX WARN: Code duplicated, block: B:265:0x057d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0588  */
    /* JADX WARN: Code duplicated, block: B:268:0x058c  */
    /* JADX WARN: Code duplicated, block: B:269:0x059a  */
    /* JADX WARN: Code duplicated, block: B:271:0x059f  */
    /* JADX WARN: Code duplicated, block: B:273:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:274:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:278:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:285:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:289:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:290:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:293:0x0640  */
    /* JADX WARN: Code duplicated, block: B:295:0x0643  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk;
        int childCount;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4;
        int iMax;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5;
        int iMin;
        int i8;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6;
        int iMax2;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk7;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int iMin2;
        int iMin3;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk8;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk9;
        boolean z3;
        int i12;
        setAlignment setalignment;
        int i13;
        int i14;
        setAlignment setalignment2;
        int i15;
        int i16;
        setAlignment setalignment3;
        int i17;
        int i18;
        shadows4CzXIIdefault shadows4czxiidefault;
        int i19;
        int i20;
        float f;
        setAlignment setalignment4;
        setAlignment setalignment5;
        setAlignment setalignment6;
        int i21;
        ArrayList arrayList;
        String str;
        int iIconCompatParcelizer;
        setAlignment setalignment7;
        ConstraintLayout constraintLayout = this;
        boolean z4 = constraintLayout.MediaDescriptionCompat;
        constraintLayout.MediaDescriptionCompat = z4;
        int i22 = 0;
        if (!z4) {
            int childCount2 = getChildCount();
            for (int i23 = 0; i23 < childCount2; i23++) {
                if (constraintLayout.getChildAt(i23).isLayoutRequested()) {
                    constraintLayout.MediaDescriptionCompat = true;
                    break;
                }
            }
        }
        boolean z5 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        getUseIntrinsicSize getuseintrinsicsize = constraintLayout.MediaSessionCompatQueueItem;
        getuseintrinsicsize.RatingCompat = z5;
        if (constraintLayout.MediaDescriptionCompat) {
            constraintLayout.MediaDescriptionCompat = false;
            int childCount3 = getChildCount();
            int i24 = 0;
            while (true) {
                if (i24 >= childCount3) {
                    z3 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i24).isLayoutRequested()) {
                        z3 = true;
                        break;
                    }
                    i24++;
                }
            }
            if (z3) {
                boolean zIsInEditMode = isInEditMode();
                int childCount4 = getChildCount();
                for (int i25 = 0; i25 < childCount4; i25++) {
                    setAlignment viewWidget = constraintLayout.getViewWidget(constraintLayout.getChildAt(i25));
                    if (viewWidget != null) {
                        viewWidget.MediaSessionCompatResultReceiverWrapper();
                    }
                }
                SparseArray sparseArray = constraintLayout.serializer;
                if (zIsInEditMode) {
                    for (int i26 = 0; i26 < childCount4; i26++) {
                        View childAt = constraintLayout.getChildAt(i26);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            int id = childAt.getId();
                            if (resourceName != null) {
                                if (constraintLayout.MediaMetadataCompat == null) {
                                    constraintLayout.MediaMetadataCompat = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.MediaMetadataCompat.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, Integer.valueOf(id));
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 != 0) {
                                View viewFindViewById = (View) sparseArray.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById != constraintLayout) {
                                    setalignment7 = viewFindViewById == null ? null : ((shadows4CzXIIdefault) viewFindViewById.getLayoutParams()).onBackPressedInput_delegatelambda0;
                                }
                                setalignment7.accessensureViewModelStore = resourceName;
                            }
                            setalignment7 = getuseintrinsicsize;
                            setalignment7.accessensureViewModelStore = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.MediaBrowserCompatMediaItem != -1) {
                    for (int i27 = 0; i27 < childCount4; i27++) {
                        constraintLayout.getChildAt(i27).getId();
                    }
                }
                ConstraintSet constraintSet = constraintLayout.RatingCompat;
                if (constraintSet != null) {
                    constraintSet.applyToInternal(constraintLayout);
                }
                getuseintrinsicsize.serializer.clear();
                ArrayList arrayList2 = constraintLayout.IconCompatParcelizer;
                int size = arrayList2.size();
                if (size > 0) {
                    int i28 = 0;
                    while (i28 < size) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList2.get(i28);
                        HashMap map = constraintHelper.RatingCompat;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.MediaBrowserCompatMediaItem);
                        }
                        setPainter setpainter = constraintHelper.MediaDescriptionCompat;
                        if (setpainter == null) {
                            arrayList = arrayList2;
                        } else {
                            setpainter.removeOnMultiWindowModeChangedListener = i22;
                            Arrays.fill(setpainter.removeOnContextAvailableListener, (Object) null);
                            int i29 = i22;
                            while (i29 < constraintHelper.RemoteActionCompatParcelizer) {
                                int i30 = constraintHelper.MediaSessionCompatQueueItem[i29];
                                View view = (View) sparseArray.get(i30);
                                if (view == null && (iIconCompatParcelizer = constraintHelper.IconCompatParcelizer(constraintLayout, (str = (String) map.get(Integer.valueOf(i30))))) != 0) {
                                    constraintHelper.MediaSessionCompatQueueItem[i29] = iIconCompatParcelizer;
                                    map.put(Integer.valueOf(iIconCompatParcelizer), str);
                                    view = (View) sparseArray.get(iIconCompatParcelizer);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    constraintHelper.MediaDescriptionCompat.write(constraintLayout.getViewWidget(view2));
                                }
                                i29++;
                                arrayList2 = arrayList2;
                            }
                            arrayList = arrayList2;
                            constraintHelper.MediaDescriptionCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        }
                        i28++;
                        arrayList2 = arrayList;
                        i22 = 0;
                    }
                }
                for (int i31 = 0; i31 < childCount4; i31++) {
                    constraintLayout.getChildAt(i31);
                }
                SparseArray sparseArray2 = constraintLayout.ComponentActivity;
                sparseArray2.clear();
                sparseArray2.put(0, getuseintrinsicsize);
                sparseArray2.put(getId(), getuseintrinsicsize);
                for (int i32 = 0; i32 < childCount4; i32++) {
                    View childAt2 = constraintLayout.getChildAt(i32);
                    sparseArray2.put(childAt2.getId(), constraintLayout.getViewWidget(childAt2));
                }
                int i33 = 0;
                while (i33 < childCount4) {
                    View childAt3 = constraintLayout.getChildAt(i33);
                    setAlignment viewWidget2 = constraintLayout.getViewWidget(childAt3);
                    if (viewWidget2 != null) {
                        shadows4CzXIIdefault shadows4czxiidefault2 = (shadows4CzXIIdefault) childAt3.getLayoutParams();
                        getuseintrinsicsize.serializer(viewWidget2);
                        shadows4czxiidefault2.RemoteActionCompatParcelizer();
                        viewWidget2.onMultiWindowModeChanged = childAt3.getVisibility();
                        viewWidget2._init_lambda3 = childAt3;
                        if (childAt3 instanceof ConstraintHelper) {
                            ((ConstraintHelper) childAt3).serializer(viewWidget2, getuseintrinsicsize.RatingCompat);
                        }
                        if (shadows4czxiidefault2.accessensureViewModelStore) {
                            setSizeToIntrinsics setsizetointrinsics = (setSizeToIntrinsics) viewWidget2;
                            int i34 = shadows4czxiidefault2.ensureViewModelStore;
                            int i35 = shadows4czxiidefault2.fullyDrawnReporter_delegatelambda00;
                            float f2 = shadows4czxiidefault2.menuHostHelperlambda0;
                            if (f2 != -1.0f) {
                                if (f2 > -1.0f) {
                                    setsizetointrinsics.RemoteActionCompatParcelizer = f2;
                                    setsizetointrinsics.write = -1;
                                    setsizetointrinsics.serializer = -1;
                                }
                            } else if (i34 != -1) {
                                if (i34 > -1) {
                                    setsizetointrinsics.RemoteActionCompatParcelizer = -1.0f;
                                    setsizetointrinsics.write = i34;
                                    setsizetointrinsics.serializer = -1;
                                }
                            } else if (i35 != -1 && i35 > -1) {
                                setsizetointrinsics.RemoteActionCompatParcelizer = -1.0f;
                                setsizetointrinsics.write = -1;
                                setsizetointrinsics.serializer = i35;
                            }
                        } else {
                            int i36 = shadows4czxiidefault2.getOnBackPressedInput;
                            int i37 = shadows4czxiidefault2.fullyDrawnReporter_delegatelambda0;
                            int i38 = shadows4czxiidefault2.addContentView;
                            int i39 = shadows4czxiidefault2.onBackPressedDispatcher_delegatelambda0;
                            int i40 = shadows4czxiidefault2.addObserverForBackInvokerlambda0;
                            int i41 = shadows4czxiidefault2.addObserverForBackInvoker;
                            float f3 = shadows4czxiidefault2.getSavedStateRegistryControllerannotations;
                            int i42 = shadows4czxiidefault2.RatingCompat;
                            if (i42 != -1) {
                                setAlignment setalignment8 = (setAlignment) sparseArray2.get(i42);
                                if (setalignment8 != null) {
                                    float f4 = shadows4czxiidefault2.MediaMetadataCompat;
                                    int i43 = shadows4czxiidefault2.MediaBrowserCompatMediaItem;
                                    calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu = calculateScaledSizeE7KxVPU.CENTER;
                                    viewWidget2.write(calculatescaledsizee7kxvpu, setalignment8, calculatescaledsizee7kxvpu, i43, 0);
                                    viewWidget2._init_lambda1 = f4;
                                }
                                shadows4czxiidefault = shadows4czxiidefault2;
                                i18 = -1;
                            } else {
                                if (i36 != -1) {
                                    setAlignment setalignment9 = (setAlignment) sparseArray2.get(i36);
                                    if (setalignment9 != null) {
                                        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu2 = calculateScaledSizeE7KxVPU.LEFT;
                                        viewWidget2.write(calculatescaledsizee7kxvpu2, setalignment9, calculatescaledsizee7kxvpu2, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).leftMargin, i40);
                                    }
                                } else {
                                    i12 = -1;
                                    if (i37 != -1) {
                                        setAlignment setalignment10 = (setAlignment) sparseArray2.get(i37);
                                        if (setalignment10 != null) {
                                            viewWidget2.write(calculateScaledSizeE7KxVPU.LEFT, setalignment10, calculateScaledSizeE7KxVPU.RIGHT, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).leftMargin, i40);
                                        }
                                    } else {
                                        if (i38 != i12) {
                                            setalignment6 = (setAlignment) sparseArray2.get(i38);
                                            if (setalignment6 != null) {
                                                viewWidget2.write(calculateScaledSizeE7KxVPU.RIGHT, setalignment6, calculateScaledSizeE7KxVPU.LEFT, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).rightMargin, i41);
                                            }
                                        } else if (i39 != i12 && (setalignment = (setAlignment) sparseArray2.get(i39)) != null) {
                                            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu3 = calculateScaledSizeE7KxVPU.RIGHT;
                                            viewWidget2.write(calculatescaledsizee7kxvpu3, setalignment, calculatescaledsizee7kxvpu3, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).rightMargin, i41);
                                        }
                                        i13 = shadows4czxiidefault2.getDefaultViewModelCreationExtras;
                                        if (i13 != -1) {
                                            setalignment5 = (setAlignment) sparseArray2.get(i13);
                                            if (setalignment5 != null) {
                                                calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu4 = calculateScaledSizeE7KxVPU.TOP;
                                                viewWidget2.write(calculatescaledsizee7kxvpu4, setalignment5, calculatescaledsizee7kxvpu4, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).topMargin, shadows4czxiidefault2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                                            }
                                        } else {
                                            i14 = shadows4czxiidefault2.getDefaultViewModelProviderFactory;
                                            if (i14 != -1 && (setalignment2 = (setAlignment) sparseArray2.get(i14)) != null) {
                                                viewWidget2.write(calculateScaledSizeE7KxVPU.TOP, setalignment2, calculateScaledSizeE7KxVPU.BOTTOM, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).topMargin, shadows4czxiidefault2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                                            }
                                        }
                                        i15 = shadows4czxiidefault2.MediaDescriptionCompat;
                                        if (i15 != -1) {
                                            setalignment4 = (setAlignment) sparseArray2.get(i15);
                                            if (setalignment4 != null) {
                                                viewWidget2.write(calculateScaledSizeE7KxVPU.BOTTOM, setalignment4, calculateScaledSizeE7KxVPU.TOP, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).bottomMargin, shadows4czxiidefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                                            }
                                        } else {
                                            i16 = shadows4czxiidefault2.RemoteActionCompatParcelizer;
                                            if (i16 != -1 && (setalignment3 = (setAlignment) sparseArray2.get(i16)) != null) {
                                                calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu5 = calculateScaledSizeE7KxVPU.BOTTOM;
                                                viewWidget2.write(calculatescaledsizee7kxvpu5, setalignment3, calculatescaledsizee7kxvpu5, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).bottomMargin, shadows4czxiidefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                                            }
                                        }
                                        i17 = shadows4czxiidefault2.read;
                                        if (i17 != -1) {
                                            i18 = -1;
                                            shadows4czxiidefault = shadows4czxiidefault2;
                                            setWidgetBaseline(viewWidget2, shadows4czxiidefault2, sparseArray2, i17, calculateScaledSizeE7KxVPU.BASELINE);
                                        } else {
                                            i18 = -1;
                                            shadows4czxiidefault = shadows4czxiidefault2;
                                            i19 = shadows4czxiidefault.IconCompatParcelizer;
                                            if (i19 != -1) {
                                                setWidgetBaseline(viewWidget2, shadows4czxiidefault, sparseArray2, i19, calculateScaledSizeE7KxVPU.TOP);
                                            } else {
                                                i20 = shadows4czxiidefault.write;
                                                if (i20 != -1) {
                                                    setWidgetBaseline(viewWidget2, shadows4czxiidefault, sparseArray2, i20, calculateScaledSizeE7KxVPU.BOTTOM);
                                                }
                                            }
                                        }
                                        if (f3 >= 0.0f) {
                                            viewWidget2.fullyDrawnReporter_delegatelambda0 = f3;
                                        }
                                        f = shadows4czxiidefault.getLastCustomNonConfigurationInstance;
                                        if (f >= 0.0f) {
                                            viewWidget2.onBackPressed = f;
                                        }
                                    }
                                }
                                i12 = -1;
                                if (i38 != i12) {
                                    setalignment6 = (setAlignment) sparseArray2.get(i38);
                                    if (setalignment6 != null) {
                                        viewWidget2.write(calculateScaledSizeE7KxVPU.RIGHT, setalignment6, calculateScaledSizeE7KxVPU.LEFT, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).rightMargin, i41);
                                    }
                                } else if (i39 != i12) {
                                    calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu6 = calculateScaledSizeE7KxVPU.RIGHT;
                                    viewWidget2.write(calculatescaledsizee7kxvpu6, setalignment, calculatescaledsizee7kxvpu6, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).rightMargin, i41);
                                }
                                i13 = shadows4czxiidefault2.getDefaultViewModelCreationExtras;
                                if (i13 != -1) {
                                    setalignment5 = (setAlignment) sparseArray2.get(i13);
                                    if (setalignment5 != null) {
                                        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu7 = calculateScaledSizeE7KxVPU.TOP;
                                        viewWidget2.write(calculatescaledsizee7kxvpu7, setalignment5, calculatescaledsizee7kxvpu7, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).topMargin, shadows4czxiidefault2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                                    }
                                } else {
                                    i14 = shadows4czxiidefault2.getDefaultViewModelProviderFactory;
                                    if (i14 != -1) {
                                        viewWidget2.write(calculateScaledSizeE7KxVPU.TOP, setalignment2, calculateScaledSizeE7KxVPU.BOTTOM, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).topMargin, shadows4czxiidefault2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                                    }
                                }
                                i15 = shadows4czxiidefault2.MediaDescriptionCompat;
                                if (i15 != -1) {
                                    setalignment4 = (setAlignment) sparseArray2.get(i15);
                                    if (setalignment4 != null) {
                                        viewWidget2.write(calculateScaledSizeE7KxVPU.BOTTOM, setalignment4, calculateScaledSizeE7KxVPU.TOP, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).bottomMargin, shadows4czxiidefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                                    }
                                } else {
                                    i16 = shadows4czxiidefault2.RemoteActionCompatParcelizer;
                                    if (i16 != -1) {
                                        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu8 = calculateScaledSizeE7KxVPU.BOTTOM;
                                        viewWidget2.write(calculatescaledsizee7kxvpu8, setalignment3, calculatescaledsizee7kxvpu8, ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).bottomMargin, shadows4czxiidefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                                    }
                                }
                                i17 = shadows4czxiidefault2.read;
                                if (i17 != -1) {
                                    i18 = -1;
                                    shadows4czxiidefault = shadows4czxiidefault2;
                                    setWidgetBaseline(viewWidget2, shadows4czxiidefault2, sparseArray2, i17, calculateScaledSizeE7KxVPU.BASELINE);
                                } else {
                                    i18 = -1;
                                    shadows4czxiidefault = shadows4czxiidefault2;
                                    i19 = shadows4czxiidefault.IconCompatParcelizer;
                                    if (i19 != -1) {
                                        setWidgetBaseline(viewWidget2, shadows4czxiidefault, sparseArray2, i19, calculateScaledSizeE7KxVPU.TOP);
                                    } else {
                                        i20 = shadows4czxiidefault.write;
                                        if (i20 != -1) {
                                            setWidgetBaseline(viewWidget2, shadows4czxiidefault, sparseArray2, i20, calculateScaledSizeE7KxVPU.BOTTOM);
                                        }
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    viewWidget2.fullyDrawnReporter_delegatelambda0 = f3;
                                }
                                f = shadows4czxiidefault.getLastCustomNonConfigurationInstance;
                                if (f >= 0.0f) {
                                    viewWidget2.onBackPressed = f;
                                }
                            }
                            if (zIsInEditMode && ((i21 = shadows4czxiidefault.PlaybackStateCompat) != i18 || shadows4czxiidefault.ParcelableVolumeInfo != i18)) {
                                int i44 = shadows4czxiidefault.ParcelableVolumeInfo;
                                viewWidget2.onPictureInPictureModeChanged = i21;
                                viewWidget2.onRetainNonConfigurationInstance = i44;
                            }
                            if (!shadows4czxiidefault._init_lambda4) {
                                if (((ViewGroup.MarginLayoutParams) shadows4czxiidefault).width == i18) {
                                    if (shadows4czxiidefault.MediaSessionCompatToken) {
                                        viewWidget2.write(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT);
                                    } else {
                                        viewWidget2.write(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT);
                                    }
                                    viewWidget2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT).IconCompatParcelizer = ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).leftMargin;
                                    viewWidget2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT).IconCompatParcelizer = ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).rightMargin;
                                } else {
                                    viewWidget2.write(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT);
                                    viewWidget2.MediaSessionCompatQueueItem(0);
                                }
                            } else {
                                viewWidget2.write(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
                                viewWidget2.MediaSessionCompatQueueItem(((ViewGroup.MarginLayoutParams) shadows4czxiidefault).width);
                                if (((ViewGroup.MarginLayoutParams) shadows4czxiidefault).width == -2) {
                                    viewWidget2.write(hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT);
                                }
                            }
                            if (!shadows4czxiidefault.onBackPressedDispatcher_delegatelambda00) {
                                if (((ViewGroup.MarginLayoutParams) shadows4czxiidefault).height == i18) {
                                    if (shadows4czxiidefault.MediaSessionCompatQueueItem) {
                                        viewWidget2.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT);
                                    } else {
                                        viewWidget2.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT);
                                    }
                                    viewWidget2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP).IconCompatParcelizer = ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).topMargin;
                                    viewWidget2.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM).IconCompatParcelizer = ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).bottomMargin;
                                } else {
                                    viewWidget2.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT);
                                    viewWidget2.MediaMetadataCompat(0);
                                }
                            } else {
                                viewWidget2.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
                                viewWidget2.MediaMetadataCompat(((ViewGroup.MarginLayoutParams) shadows4czxiidefault).height);
                                if (((ViewGroup.MarginLayoutParams) shadows4czxiidefault).height == -2) {
                                    viewWidget2.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT);
                                }
                            }
                            viewWidget2.serializer(shadows4czxiidefault.MediaSessionCompatResultReceiverWrapper);
                            float f5 = shadows4czxiidefault._init_lambda3;
                            float[] fArr = viewWidget2.onRequestPermissionsResult;
                            fArr[0] = f5;
                            fArr[1] = shadows4czxiidefault.getSavedStateRegistry;
                            viewWidget2.menuHostHelperlambda0 = shadows4czxiidefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                            viewWidget2.onCreate = shadows4czxiidefault.getOnBackPressedDispatcher;
                            int i45 = shadows4czxiidefault.getViewModelStore;
                            if (i45 >= 0 && i45 <= 3) {
                                viewWidget2.onPictureInPictureUiStateChanged = i45;
                            }
                            viewWidget2.serializer(shadows4czxiidefault.addOnTrimMemoryListener, shadows4czxiidefault.addOnMultiWindowModeChangedListener, shadows4czxiidefault.addOnConfigurationChangedListener, shadows4czxiidefault.addMenuProvider);
                            viewWidget2.RemoteActionCompatParcelizer(shadows4czxiidefault.addOnPictureInPictureUiStateChangedListener, shadows4czxiidefault.onBackPressedDispatcher_delegatelambda010, shadows4czxiidefault.addOnNewIntentListener, shadows4czxiidefault.addOnContextAvailableListener);
                        }
                    }
                    i33++;
                    constraintLayout = this;
                    childCount4 = childCount4;
                }
            }
            if (z3) {
                getuseintrinsicsize.read.read(getuseintrinsicsize);
            }
        }
        getuseintrinsicsize.ComponentActivity.getClass();
        int i46 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i47 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        Measurer measurer = this.PlaybackStateCompat;
        measurer.MediaMetadataCompat = iMax3;
        measurer.write = iMax4;
        measurer.MediaDescriptionCompat = paddingWidth;
        measurer.read = i47;
        measurer.IconCompatParcelizer = i;
        measurer.RemoteActionCompatParcelizer = i2;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else {
            if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
                i3 = 1 == getLayoutDirection() ? iMax6 : iMax5;
            }
            i4 = size2 - paddingWidth;
            i5 = size3 - i47;
            i6 = measurer.read;
            i7 = measurer.MediaDescriptionCompat;
            hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
            childCount = getChildCount();
            if (mode != Integer.MIN_VALUE) {
                hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                if (childCount == 0) {
                    hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk3;
                    iMax = Math.max(0, this.MediaSessionCompatResultReceiverWrapper);
                } else {
                    hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk3;
                    iMax = i4;
                }
            } else {
                if (mode != 0) {
                    hasspecifiedandfiniteheightuvyycjk9 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                    if (childCount == 0) {
                        hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                        hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk9;
                        iMax = Math.max(0, this.MediaSessionCompatResultReceiverWrapper);
                    } else {
                        hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                        hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk9;
                        iMax = 0;
                    }
                } else if (mode != 1073741824) {
                    hasspecifiedandfiniteheightuvyycjk5 = hasspecifiedandfiniteheightuvyycjk;
                    hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk5;
                    iMax = 0;
                    i8 = Integer.MIN_VALUE;
                    hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk10 = hasspecifiedandfiniteheightuvyycjk5;
                    iMin = iMax;
                    hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjk10;
                } else {
                    iMin = Math.min(this.ParcelableVolumeInfo - i7, i4);
                    hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                    i8 = Integer.MIN_VALUE;
                }
                if (mode2 != i8) {
                    hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                    if (childCount == 0) {
                        iMax2 = Math.max(0, this.MediaSessionCompatToken);
                    } else {
                        iMax2 = i5;
                    }
                } else {
                    if (mode2 != 0) {
                        hasspecifiedandfiniteheightuvyycjk8 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                        if (childCount == 0) {
                            hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk8;
                            iMax2 = Math.max(0, this.MediaSessionCompatToken);
                        } else {
                            hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk8;
                            iMax2 = 0;
                        }
                    } else if (mode2 != 1073741824) {
                        hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk2;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.PlaybackStateCompatCustomAction - i6, i5);
                        hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk2;
                    }
                    if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem() || iMax2 != getuseintrinsicsize.MediaDescriptionCompat()) {
                        getuseintrinsicsize.write.read = true;
                        i9 = 0;
                    } else {
                        i9 = 0;
                    }
                    getuseintrinsicsize.onPictureInPictureModeChanged = i9;
                    getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
                    int i48 = this.ParcelableVolumeInfo;
                    int[] iArr = getuseintrinsicsize.getActivityResultRegistry;
                    iArr[i9] = i48 - i7;
                    iArr[1] = this.PlaybackStateCompatCustomAction - i6;
                    getuseintrinsicsize.getFullyDrawnReporter = i9;
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                    getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
                    getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
                    getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
                    getuseintrinsicsize.MediaMetadataCompat(iMax2);
                    i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
                    if (i10 < 0) {
                        getuseintrinsicsize.getFullyDrawnReporter = i9;
                    } else {
                        getuseintrinsicsize.getFullyDrawnReporter = i10;
                    }
                    i11 = this.MediaSessionCompatToken - i6;
                    if (i11 < 0) {
                        getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                    } else {
                        getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
                    }
                    getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
                    int iMediaSessionCompatQueueItem = getuseintrinsicsize.MediaSessionCompatQueueItem();
                    int iMediaDescriptionCompat = getuseintrinsicsize.MediaDescriptionCompat();
                    z = getuseintrinsicsize.removeMenuProvider;
                    z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
                    int i49 = measurer.read;
                    int iResolveSizeAndState = View.resolveSizeAndState(iMediaSessionCompatQueueItem + measurer.MediaDescriptionCompat, i, 0);
                    int iResolveSizeAndState2 = View.resolveSizeAndState(iMediaDescriptionCompat + i49, i2, 0);
                    iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState & 16777215);
                    iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState2 & 16777215);
                    if (z) {
                        iMin2 |= 16777216;
                    }
                    if (z2) {
                        iMin3 |= 16777216;
                    }
                    setMeasuredDimension(iMin2, iMin3);
                }
                hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk6;
                if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
                    getuseintrinsicsize.write.read = true;
                    i9 = 0;
                } else {
                    getuseintrinsicsize.write.read = true;
                    i9 = 0;
                }
                getuseintrinsicsize.onPictureInPictureModeChanged = i9;
                getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
                int i410 = this.ParcelableVolumeInfo;
                int[] iArr2 = getuseintrinsicsize.getActivityResultRegistry;
                iArr2[i9] = i410 - i7;
                iArr2[1] = this.PlaybackStateCompatCustomAction - i6;
                getuseintrinsicsize.getFullyDrawnReporter = i9;
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
                getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
                getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
                getuseintrinsicsize.MediaMetadataCompat(iMax2);
                i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
                if (i10 < 0) {
                    getuseintrinsicsize.getFullyDrawnReporter = i9;
                } else {
                    getuseintrinsicsize.getFullyDrawnReporter = i10;
                }
                i11 = this.MediaSessionCompatToken - i6;
                if (i11 < 0) {
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                } else {
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
                }
                getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
                int iMediaSessionCompatQueueItem2 = getuseintrinsicsize.MediaSessionCompatQueueItem();
                int iMediaDescriptionCompat2 = getuseintrinsicsize.MediaDescriptionCompat();
                z = getuseintrinsicsize.removeMenuProvider;
                z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
                int i411 = measurer.read;
                int iResolveSizeAndState3 = View.resolveSizeAndState(iMediaSessionCompatQueueItem2 + measurer.MediaDescriptionCompat, i, 0);
                int iResolveSizeAndState4 = View.resolveSizeAndState(iMediaDescriptionCompat2 + i411, i2, 0);
                iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState3 & 16777215);
                iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState4 & 16777215);
                if (z) {
                    iMin2 |= 16777216;
                }
                if (z2) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            hasspecifiedandfiniteheightuvyycjk5 = hasspecifiedandfiniteheightuvyycjk4;
            i8 = Integer.MIN_VALUE;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk11 = hasspecifiedandfiniteheightuvyycjk5;
            iMin = iMax;
            hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjk11;
            if (mode2 != i8) {
                hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                if (childCount == 0) {
                    iMax2 = Math.max(0, this.MediaSessionCompatToken);
                } else {
                    iMax2 = i5;
                }
            } else {
                if (mode2 != 0) {
                    hasspecifiedandfiniteheightuvyycjk8 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                    if (childCount == 0) {
                        hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk8;
                        iMax2 = Math.max(0, this.MediaSessionCompatToken);
                    } else {
                        hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk8;
                        iMax2 = 0;
                    }
                } else if (mode2 != 1073741824) {
                    hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk2;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.PlaybackStateCompatCustomAction - i6, i5);
                    hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk2;
                }
                if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
                    getuseintrinsicsize.write.read = true;
                    i9 = 0;
                } else {
                    getuseintrinsicsize.write.read = true;
                    i9 = 0;
                }
                getuseintrinsicsize.onPictureInPictureModeChanged = i9;
                getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
                int i412 = this.ParcelableVolumeInfo;
                int[] iArr3 = getuseintrinsicsize.getActivityResultRegistry;
                iArr3[i9] = i412 - i7;
                iArr3[1] = this.PlaybackStateCompatCustomAction - i6;
                getuseintrinsicsize.getFullyDrawnReporter = i9;
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
                getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
                getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
                getuseintrinsicsize.MediaMetadataCompat(iMax2);
                i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
                if (i10 < 0) {
                    getuseintrinsicsize.getFullyDrawnReporter = i9;
                } else {
                    getuseintrinsicsize.getFullyDrawnReporter = i10;
                }
                i11 = this.MediaSessionCompatToken - i6;
                if (i11 < 0) {
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                } else {
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
                }
                getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
                int iMediaSessionCompatQueueItem3 = getuseintrinsicsize.MediaSessionCompatQueueItem();
                int iMediaDescriptionCompat3 = getuseintrinsicsize.MediaDescriptionCompat();
                z = getuseintrinsicsize.removeMenuProvider;
                z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
                int i413 = measurer.read;
                int iResolveSizeAndState5 = View.resolveSizeAndState(iMediaSessionCompatQueueItem3 + measurer.MediaDescriptionCompat, i, 0);
                int iResolveSizeAndState6 = View.resolveSizeAndState(iMediaDescriptionCompat3 + i413, i2, 0);
                iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState5 & 16777215);
                iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState6 & 16777215);
                if (z) {
                    iMin2 |= 16777216;
                }
                if (z2) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk6;
            if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
                getuseintrinsicsize.write.read = true;
                i9 = 0;
            } else {
                getuseintrinsicsize.write.read = true;
                i9 = 0;
            }
            getuseintrinsicsize.onPictureInPictureModeChanged = i9;
            getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
            int i414 = this.ParcelableVolumeInfo;
            int[] iArr4 = getuseintrinsicsize.getActivityResultRegistry;
            iArr4[i9] = i414 - i7;
            iArr4[1] = this.PlaybackStateCompatCustomAction - i6;
            getuseintrinsicsize.getFullyDrawnReporter = i9;
            getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
            getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
            getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
            getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
            getuseintrinsicsize.MediaMetadataCompat(iMax2);
            i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
            if (i10 < 0) {
                getuseintrinsicsize.getFullyDrawnReporter = i9;
            } else {
                getuseintrinsicsize.getFullyDrawnReporter = i10;
            }
            i11 = this.MediaSessionCompatToken - i6;
            if (i11 < 0) {
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
            } else {
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
            }
            getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
            int iMediaSessionCompatQueueItem4 = getuseintrinsicsize.MediaSessionCompatQueueItem();
            int iMediaDescriptionCompat4 = getuseintrinsicsize.MediaDescriptionCompat();
            z = getuseintrinsicsize.removeMenuProvider;
            z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
            int i415 = measurer.read;
            int iResolveSizeAndState7 = View.resolveSizeAndState(iMediaSessionCompatQueueItem4 + measurer.MediaDescriptionCompat, i, 0);
            int iResolveSizeAndState8 = View.resolveSizeAndState(iMediaDescriptionCompat4 + i415, i2, 0);
            iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState7 & 16777215);
            iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState8 & 16777215);
            if (z) {
                iMin2 |= 16777216;
            }
            if (z2) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        i3 = iMax5;
        i4 = size2 - paddingWidth;
        i5 = size3 - i47;
        i6 = measurer.read;
        i7 = measurer.MediaDescriptionCompat;
        hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
            hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
            if (childCount == 0) {
                hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk3;
                iMax = Math.max(0, this.MediaSessionCompatResultReceiverWrapper);
            } else {
                hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk3;
                iMax = i4;
            }
        } else {
            if (mode != 0) {
                hasspecifiedandfiniteheightuvyycjk9 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                if (childCount == 0) {
                    hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                    hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk9;
                    iMax = Math.max(0, this.MediaSessionCompatResultReceiverWrapper);
                } else {
                    hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                    hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjk9;
                    iMax = 0;
                }
            } else if (mode != 1073741824) {
                hasspecifiedandfiniteheightuvyycjk5 = hasspecifiedandfiniteheightuvyycjk;
                hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk5;
                iMax = 0;
                i8 = Integer.MIN_VALUE;
                hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk12 = hasspecifiedandfiniteheightuvyycjk5;
                iMin = iMax;
                hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjk12;
            } else {
                iMin = Math.min(this.ParcelableVolumeInfo - i7, i4);
                hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjk;
                i8 = Integer.MIN_VALUE;
            }
            if (mode2 != i8) {
                hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                if (childCount == 0) {
                    iMax2 = Math.max(0, this.MediaSessionCompatToken);
                } else {
                    iMax2 = i5;
                }
            } else {
                if (mode2 != 0) {
                    hasspecifiedandfiniteheightuvyycjk8 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                    if (childCount == 0) {
                        hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk8;
                        iMax2 = Math.max(0, this.MediaSessionCompatToken);
                    } else {
                        hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk8;
                        iMax2 = 0;
                    }
                } else if (mode2 != 1073741824) {
                    hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk2;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.PlaybackStateCompatCustomAction - i6, i5);
                    hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk2;
                }
                if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
                    getuseintrinsicsize.write.read = true;
                    i9 = 0;
                } else {
                    getuseintrinsicsize.write.read = true;
                    i9 = 0;
                }
                getuseintrinsicsize.onPictureInPictureModeChanged = i9;
                getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
                int i416 = this.ParcelableVolumeInfo;
                int[] iArr5 = getuseintrinsicsize.getActivityResultRegistry;
                iArr5[i9] = i416 - i7;
                iArr5[1] = this.PlaybackStateCompatCustomAction - i6;
                getuseintrinsicsize.getFullyDrawnReporter = i9;
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
                getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
                getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
                getuseintrinsicsize.MediaMetadataCompat(iMax2);
                i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
                if (i10 < 0) {
                    getuseintrinsicsize.getFullyDrawnReporter = i9;
                } else {
                    getuseintrinsicsize.getFullyDrawnReporter = i10;
                }
                i11 = this.MediaSessionCompatToken - i6;
                if (i11 < 0) {
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
                } else {
                    getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
                }
                getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
                int iMediaSessionCompatQueueItem5 = getuseintrinsicsize.MediaSessionCompatQueueItem();
                int iMediaDescriptionCompat5 = getuseintrinsicsize.MediaDescriptionCompat();
                z = getuseintrinsicsize.removeMenuProvider;
                z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
                int i417 = measurer.read;
                int iResolveSizeAndState9 = View.resolveSizeAndState(iMediaSessionCompatQueueItem5 + measurer.MediaDescriptionCompat, i, 0);
                int iResolveSizeAndState10 = View.resolveSizeAndState(iMediaDescriptionCompat5 + i417, i2, 0);
                iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState9 & 16777215);
                iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState10 & 16777215);
                if (z) {
                    iMin2 |= 16777216;
                }
                if (z2) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk6;
            if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
                getuseintrinsicsize.write.read = true;
                i9 = 0;
            } else {
                getuseintrinsicsize.write.read = true;
                i9 = 0;
            }
            getuseintrinsicsize.onPictureInPictureModeChanged = i9;
            getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
            int i418 = this.ParcelableVolumeInfo;
            int[] iArr6 = getuseintrinsicsize.getActivityResultRegistry;
            iArr6[i9] = i418 - i7;
            iArr6[1] = this.PlaybackStateCompatCustomAction - i6;
            getuseintrinsicsize.getFullyDrawnReporter = i9;
            getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
            getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
            getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
            getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
            getuseintrinsicsize.MediaMetadataCompat(iMax2);
            i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
            if (i10 < 0) {
                getuseintrinsicsize.getFullyDrawnReporter = i9;
            } else {
                getuseintrinsicsize.getFullyDrawnReporter = i10;
            }
            i11 = this.MediaSessionCompatToken - i6;
            if (i11 < 0) {
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
            } else {
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
            }
            getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
            int iMediaSessionCompatQueueItem6 = getuseintrinsicsize.MediaSessionCompatQueueItem();
            int iMediaDescriptionCompat6 = getuseintrinsicsize.MediaDescriptionCompat();
            z = getuseintrinsicsize.removeMenuProvider;
            z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
            int i419 = measurer.read;
            int iResolveSizeAndState11 = View.resolveSizeAndState(iMediaSessionCompatQueueItem6 + measurer.MediaDescriptionCompat, i, 0);
            int iResolveSizeAndState12 = View.resolveSizeAndState(iMediaDescriptionCompat6 + i419, i2, 0);
            iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState11 & 16777215);
            iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState12 & 16777215);
            if (z) {
                iMin2 |= 16777216;
            }
            if (z2) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        hasspecifiedandfiniteheightuvyycjk5 = hasspecifiedandfiniteheightuvyycjk4;
        i8 = Integer.MIN_VALUE;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk13 = hasspecifiedandfiniteheightuvyycjk5;
        iMin = iMax;
        hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjk13;
        if (mode2 != i8) {
            hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
            if (childCount == 0) {
                iMax2 = Math.max(0, this.MediaSessionCompatToken);
            } else {
                iMax2 = i5;
            }
        } else {
            if (mode2 != 0) {
                hasspecifiedandfiniteheightuvyycjk8 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
                if (childCount == 0) {
                    hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk8;
                    iMax2 = Math.max(0, this.MediaSessionCompatToken);
                } else {
                    hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk8;
                    iMax2 = 0;
                }
            } else if (mode2 != 1073741824) {
                hasspecifiedandfiniteheightuvyycjk6 = hasspecifiedandfiniteheightuvyycjk2;
                iMax2 = 0;
            } else {
                iMax2 = Math.min(this.PlaybackStateCompatCustomAction - i6, i5);
                hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk2;
            }
            if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
                getuseintrinsicsize.write.read = true;
                i9 = 0;
            } else {
                getuseintrinsicsize.write.read = true;
                i9 = 0;
            }
            getuseintrinsicsize.onPictureInPictureModeChanged = i9;
            getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
            int i4110 = this.ParcelableVolumeInfo;
            int[] iArr7 = getuseintrinsicsize.getActivityResultRegistry;
            iArr7[i9] = i4110 - i7;
            iArr7[1] = this.PlaybackStateCompatCustomAction - i6;
            getuseintrinsicsize.getFullyDrawnReporter = i9;
            getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
            getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
            getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
            getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
            getuseintrinsicsize.MediaMetadataCompat(iMax2);
            i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
            if (i10 < 0) {
                getuseintrinsicsize.getFullyDrawnReporter = i9;
            } else {
                getuseintrinsicsize.getFullyDrawnReporter = i10;
            }
            i11 = this.MediaSessionCompatToken - i6;
            if (i11 < 0) {
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
            } else {
                getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
            }
            getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
            int iMediaSessionCompatQueueItem7 = getuseintrinsicsize.MediaSessionCompatQueueItem();
            int iMediaDescriptionCompat7 = getuseintrinsicsize.MediaDescriptionCompat();
            z = getuseintrinsicsize.removeMenuProvider;
            z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
            int i4111 = measurer.read;
            int iResolveSizeAndState13 = View.resolveSizeAndState(iMediaSessionCompatQueueItem7 + measurer.MediaDescriptionCompat, i, 0);
            int iResolveSizeAndState14 = View.resolveSizeAndState(iMediaDescriptionCompat7 + i4111, i2, 0);
            iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState13 & 16777215);
            iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState14 & 16777215);
            if (z) {
                iMin2 |= 16777216;
            }
            if (z2) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        hasspecifiedandfiniteheightuvyycjk7 = hasspecifiedandfiniteheightuvyycjk6;
        if (iMin == getuseintrinsicsize.MediaSessionCompatQueueItem()) {
            getuseintrinsicsize.write.read = true;
            i9 = 0;
        } else {
            getuseintrinsicsize.write.read = true;
            i9 = 0;
        }
        getuseintrinsicsize.onPictureInPictureModeChanged = i9;
        getuseintrinsicsize.onRetainNonConfigurationInstance = i9;
        int i4112 = this.ParcelableVolumeInfo;
        int[] iArr8 = getuseintrinsicsize.getActivityResultRegistry;
        iArr8[i9] = i4112 - i7;
        iArr8[1] = this.PlaybackStateCompatCustomAction - i6;
        getuseintrinsicsize.getFullyDrawnReporter = i9;
        getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
        getuseintrinsicsize.write(hasspecifiedandfiniteheightuvyycjk);
        getuseintrinsicsize.MediaSessionCompatQueueItem(iMin);
        getuseintrinsicsize.RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk7);
        getuseintrinsicsize.MediaMetadataCompat(iMax2);
        i10 = this.MediaSessionCompatResultReceiverWrapper - i7;
        if (i10 < 0) {
            getuseintrinsicsize.getFullyDrawnReporter = i9;
        } else {
            getuseintrinsicsize.getFullyDrawnReporter = i10;
        }
        i11 = this.MediaSessionCompatToken - i6;
        if (i11 < 0) {
            getuseintrinsicsize.getDefaultViewModelCreationExtras = i9;
        } else {
            getuseintrinsicsize.getDefaultViewModelCreationExtras = i11;
        }
        getuseintrinsicsize.write(i46, mode, i4, mode2, i5, i3, iMax3);
        int iMediaSessionCompatQueueItem8 = getuseintrinsicsize.MediaSessionCompatQueueItem();
        int iMediaDescriptionCompat8 = getuseintrinsicsize.MediaDescriptionCompat();
        z = getuseintrinsicsize.removeMenuProvider;
        z2 = getuseintrinsicsize.RemoteActionCompatParcelizer;
        int i4113 = measurer.read;
        int iResolveSizeAndState15 = View.resolveSizeAndState(iMediaSessionCompatQueueItem8 + measurer.MediaDescriptionCompat, i, 0);
        int iResolveSizeAndState16 = View.resolveSizeAndState(iMediaDescriptionCompat8 + i4113, i2, 0);
        iMin2 = Math.min(this.ParcelableVolumeInfo, iResolveSizeAndState15 & 16777215);
        iMin3 = Math.min(this.PlaybackStateCompatCustomAction, iResolveSizeAndState16 & 16777215);
        if (z) {
            iMin2 |= 16777216;
        }
        if (z2) {
            iMin3 |= 16777216;
        }
        setMeasuredDimension(iMin2, iMin3);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.serializer = new SparseArray();
        this.IconCompatParcelizer = new ArrayList(4);
        this.MediaSessionCompatQueueItem = new getUseIntrinsicSize();
        this.MediaSessionCompatResultReceiverWrapper = 0;
        this.MediaSessionCompatToken = 0;
        this.ParcelableVolumeInfo = Integer.MAX_VALUE;
        this.PlaybackStateCompatCustomAction = Integer.MAX_VALUE;
        this.MediaDescriptionCompat = true;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 257;
        this.RatingCompat = null;
        this.read = null;
        this.MediaBrowserCompatMediaItem = -1;
        this.MediaMetadataCompat = new HashMap();
        this.ComponentActivity = new SparseArray();
        this.PlaybackStateCompat = new Measurer(this);
        init(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        shadows4CzXIIdefault shadows4czxiidefault = new shadows4CzXIIdefault(layoutParams);
        shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = -1;
        shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = -1;
        shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = -1.0f;
        shadows4czxiidefault.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        shadows4czxiidefault._init_lambda2 = -1;
        shadows4czxiidefault._init_lambda1 = -1;
        shadows4czxiidefault.enterPictureInPictureMode = -1;
        shadows4czxiidefault.addOnUserLeaveHintListener = -1;
        shadows4czxiidefault.getDefaultViewModelCreationExtras = -1;
        shadows4czxiidefault.getDefaultViewModelProviderFactory = -1;
        shadows4czxiidefault.MediaDescriptionCompat = -1;
        shadows4czxiidefault.RemoteActionCompatParcelizer = -1;
        shadows4czxiidefault.read = -1;
        shadows4czxiidefault.IconCompatParcelizer = -1;
        shadows4czxiidefault.write = -1;
        shadows4czxiidefault.RatingCompat = -1;
        shadows4czxiidefault.MediaBrowserCompatMediaItem = 0;
        shadows4czxiidefault.MediaMetadataCompat = 0.0f;
        shadows4czxiidefault.getActivityResultRegistry = -1;
        shadows4czxiidefault.getFullyDrawnReporter = -1;
        shadows4czxiidefault.ResultReceiver = -1;
        shadows4czxiidefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
        shadows4czxiidefault.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Integer.MIN_VALUE;
        shadows4czxiidefault.ComponentActivity = Integer.MIN_VALUE;
        shadows4czxiidefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Integer.MIN_VALUE;
        shadows4czxiidefault.serializer = 0;
        shadows4czxiidefault.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 0.5f;
        shadows4czxiidefault.getLastCustomNonConfigurationInstance = 0.5f;
        shadows4czxiidefault.MediaSessionCompatResultReceiverWrapper = null;
        shadows4czxiidefault._init_lambda3 = -1.0f;
        shadows4czxiidefault.getSavedStateRegistry = -1.0f;
        shadows4czxiidefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 0;
        shadows4czxiidefault.getOnBackPressedDispatcher = 0;
        shadows4czxiidefault.addOnMultiWindowModeChangedListener = 0;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda010 = 0;
        shadows4czxiidefault.addOnConfigurationChangedListener = 0;
        shadows4czxiidefault.addOnNewIntentListener = 0;
        shadows4czxiidefault.addMenuProvider = 0;
        shadows4czxiidefault.addOnContextAvailableListener = 0;
        shadows4czxiidefault.addOnTrimMemoryListener = 1.0f;
        shadows4czxiidefault.addOnPictureInPictureUiStateChangedListener = 1.0f;
        shadows4czxiidefault.PlaybackStateCompat = -1;
        shadows4czxiidefault.ParcelableVolumeInfo = -1;
        shadows4czxiidefault.addOnPictureInPictureModeChangedListener = -1;
        shadows4czxiidefault.MediaSessionCompatToken = false;
        shadows4czxiidefault.MediaSessionCompatQueueItem = false;
        shadows4czxiidefault.PlaybackStateCompatCustomAction = null;
        shadows4czxiidefault.getViewModelStore = 0;
        shadows4czxiidefault._init_lambda4 = true;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda00 = true;
        shadows4czxiidefault.defaultViewModelProviderFactory_delegatelambda0 = false;
        shadows4czxiidefault.accessensureViewModelStore = false;
        shadows4czxiidefault.createFullyDrawnExecutor = false;
        shadows4czxiidefault.getOnBackPressedInput = -1;
        shadows4czxiidefault.fullyDrawnReporter_delegatelambda0 = -1;
        shadows4czxiidefault.addContentView = -1;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda0 = -1;
        shadows4czxiidefault.addObserverForBackInvokerlambda0 = Integer.MIN_VALUE;
        shadows4czxiidefault.addObserverForBackInvoker = Integer.MIN_VALUE;
        shadows4czxiidefault.getSavedStateRegistryControllerannotations = 0.5f;
        shadows4czxiidefault.onBackPressedInput_delegatelambda0 = new setAlignment();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).bottomMargin = marginLayoutParams.bottomMargin;
            shadows4czxiidefault.setMarginStart(marginLayoutParams.getMarginStart());
            shadows4czxiidefault.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof shadows4CzXIIdefault)) {
            return shadows4czxiidefault;
        }
        shadows4CzXIIdefault shadows4czxiidefault2 = (shadows4CzXIIdefault) layoutParams;
        shadows4czxiidefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = shadows4czxiidefault2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        shadows4czxiidefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = shadows4czxiidefault2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        shadows4czxiidefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = shadows4czxiidefault2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        shadows4czxiidefault.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = shadows4czxiidefault2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        shadows4czxiidefault._init_lambda2 = shadows4czxiidefault2._init_lambda2;
        shadows4czxiidefault._init_lambda1 = shadows4czxiidefault2._init_lambda1;
        shadows4czxiidefault.enterPictureInPictureMode = shadows4czxiidefault2.enterPictureInPictureMode;
        shadows4czxiidefault.addOnUserLeaveHintListener = shadows4czxiidefault2.addOnUserLeaveHintListener;
        shadows4czxiidefault.getDefaultViewModelCreationExtras = shadows4czxiidefault2.getDefaultViewModelCreationExtras;
        shadows4czxiidefault.getDefaultViewModelProviderFactory = shadows4czxiidefault2.getDefaultViewModelProviderFactory;
        shadows4czxiidefault.MediaDescriptionCompat = shadows4czxiidefault2.MediaDescriptionCompat;
        shadows4czxiidefault.RemoteActionCompatParcelizer = shadows4czxiidefault2.RemoteActionCompatParcelizer;
        shadows4czxiidefault.read = shadows4czxiidefault2.read;
        shadows4czxiidefault.IconCompatParcelizer = shadows4czxiidefault2.IconCompatParcelizer;
        shadows4czxiidefault.write = shadows4czxiidefault2.write;
        shadows4czxiidefault.RatingCompat = shadows4czxiidefault2.RatingCompat;
        shadows4czxiidefault.MediaBrowserCompatMediaItem = shadows4czxiidefault2.MediaBrowserCompatMediaItem;
        shadows4czxiidefault.MediaMetadataCompat = shadows4czxiidefault2.MediaMetadataCompat;
        shadows4czxiidefault.getActivityResultRegistry = shadows4czxiidefault2.getActivityResultRegistry;
        shadows4czxiidefault.getFullyDrawnReporter = shadows4czxiidefault2.getFullyDrawnReporter;
        shadows4czxiidefault.ResultReceiver = shadows4czxiidefault2.ResultReceiver;
        shadows4czxiidefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = shadows4czxiidefault2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        shadows4czxiidefault.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = shadows4czxiidefault2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        shadows4czxiidefault.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = shadows4czxiidefault2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        shadows4czxiidefault.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = shadows4czxiidefault2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        shadows4czxiidefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = shadows4czxiidefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        shadows4czxiidefault.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = shadows4czxiidefault2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        shadows4czxiidefault.ComponentActivity = shadows4czxiidefault2.ComponentActivity;
        shadows4czxiidefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = shadows4czxiidefault2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        shadows4czxiidefault.serializer = shadows4czxiidefault2.serializer;
        shadows4czxiidefault.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = shadows4czxiidefault2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        shadows4czxiidefault.getLastCustomNonConfigurationInstance = shadows4czxiidefault2.getLastCustomNonConfigurationInstance;
        shadows4czxiidefault.MediaSessionCompatResultReceiverWrapper = shadows4czxiidefault2.MediaSessionCompatResultReceiverWrapper;
        shadows4czxiidefault._init_lambda3 = shadows4czxiidefault2._init_lambda3;
        shadows4czxiidefault.getSavedStateRegistry = shadows4czxiidefault2.getSavedStateRegistry;
        shadows4czxiidefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = shadows4czxiidefault2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        shadows4czxiidefault.getOnBackPressedDispatcher = shadows4czxiidefault2.getOnBackPressedDispatcher;
        shadows4czxiidefault.MediaSessionCompatToken = shadows4czxiidefault2.MediaSessionCompatToken;
        shadows4czxiidefault.MediaSessionCompatQueueItem = shadows4czxiidefault2.MediaSessionCompatQueueItem;
        shadows4czxiidefault.addOnMultiWindowModeChangedListener = shadows4czxiidefault2.addOnMultiWindowModeChangedListener;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda010 = shadows4czxiidefault2.onBackPressedDispatcher_delegatelambda010;
        shadows4czxiidefault.addOnConfigurationChangedListener = shadows4czxiidefault2.addOnConfigurationChangedListener;
        shadows4czxiidefault.addMenuProvider = shadows4czxiidefault2.addMenuProvider;
        shadows4czxiidefault.addOnNewIntentListener = shadows4czxiidefault2.addOnNewIntentListener;
        shadows4czxiidefault.addOnContextAvailableListener = shadows4czxiidefault2.addOnContextAvailableListener;
        shadows4czxiidefault.addOnTrimMemoryListener = shadows4czxiidefault2.addOnTrimMemoryListener;
        shadows4czxiidefault.addOnPictureInPictureUiStateChangedListener = shadows4czxiidefault2.addOnPictureInPictureUiStateChangedListener;
        shadows4czxiidefault.PlaybackStateCompat = shadows4czxiidefault2.PlaybackStateCompat;
        shadows4czxiidefault.ParcelableVolumeInfo = shadows4czxiidefault2.ParcelableVolumeInfo;
        shadows4czxiidefault.addOnPictureInPictureModeChangedListener = shadows4czxiidefault2.addOnPictureInPictureModeChangedListener;
        shadows4czxiidefault._init_lambda4 = shadows4czxiidefault2._init_lambda4;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda00 = shadows4czxiidefault2.onBackPressedDispatcher_delegatelambda00;
        shadows4czxiidefault.defaultViewModelProviderFactory_delegatelambda0 = shadows4czxiidefault2.defaultViewModelProviderFactory_delegatelambda0;
        shadows4czxiidefault.accessensureViewModelStore = shadows4czxiidefault2.accessensureViewModelStore;
        shadows4czxiidefault.getOnBackPressedInput = shadows4czxiidefault2.getOnBackPressedInput;
        shadows4czxiidefault.fullyDrawnReporter_delegatelambda0 = shadows4czxiidefault2.fullyDrawnReporter_delegatelambda0;
        shadows4czxiidefault.addContentView = shadows4czxiidefault2.addContentView;
        shadows4czxiidefault.onBackPressedDispatcher_delegatelambda0 = shadows4czxiidefault2.onBackPressedDispatcher_delegatelambda0;
        shadows4czxiidefault.addObserverForBackInvokerlambda0 = shadows4czxiidefault2.addObserverForBackInvokerlambda0;
        shadows4czxiidefault.addObserverForBackInvoker = shadows4czxiidefault2.addObserverForBackInvoker;
        shadows4czxiidefault.getSavedStateRegistryControllerannotations = shadows4czxiidefault2.getSavedStateRegistryControllerannotations;
        shadows4czxiidefault.PlaybackStateCompatCustomAction = shadows4czxiidefault2.PlaybackStateCompatCustomAction;
        shadows4czxiidefault.getViewModelStore = shadows4czxiidefault2.getViewModelStore;
        shadows4czxiidefault.onBackPressedInput_delegatelambda0 = shadows4czxiidefault2.onBackPressedInput_delegatelambda0;
        return shadows4czxiidefault;
    }
}
