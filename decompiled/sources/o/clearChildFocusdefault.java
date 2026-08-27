package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.MovePreviousSession;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class clearChildFocusdefault {
    public static final invalidateFocusTarget IconCompatParcelizer = new invalidateFocusTarget();
    public boolean ComponentActivity;
    public int MediaBrowserCompatMediaItem;
    public int[] MediaDescriptionCompat;
    public int[] MediaMetadataCompat;
    public int[] MediaSessionCompatQueueItem;
    public float[] MediaSessionCompatResultReceiverWrapper;
    public float[] MediaSessionCompatToken;
    public float[] ParcelableVolumeInfo;
    public final float PlaybackStateCompat;
    public float[] PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public View RemoteActionCompatParcelizer;
    public final OverScroller ResultReceiver;
    public final ViewGroup r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public android.view.VelocityTracker r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final FocusTargetNodeKt read;
    public final int write;
    public int serializer = -1;
    public final MovePreviousSession r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new MovePreviousSession(2, this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.FocusTargetNodeKt] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void RemoteActionCompatParcelizer(float f, float f2, int i) {
        int i2;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(f, f2, i, 1);
        ?? r0 = zRemoteActionCompatParcelizer;
        if (RemoteActionCompatParcelizer(f2, f, i, 4)) {
            r0 = (zRemoteActionCompatParcelizer ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (RemoteActionCompatParcelizer(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (RemoteActionCompatParcelizer(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.MediaDescriptionCompat;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.read.read(r2, i);
    }

    public final void serializer() {
        this.serializer = -1;
        float[] fArr = this.ParcelableVolumeInfo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.PlaybackStateCompatCustomAction, 0.0f);
            Arrays.fill(this.MediaSessionCompatToken, 0.0f);
            Arrays.fill(this.MediaSessionCompatResultReceiverWrapper, 0.0f);
            Arrays.fill(this.MediaMetadataCompat, 0);
            Arrays.fill(this.MediaDescriptionCompat, 0);
            Arrays.fill(this.MediaSessionCompatQueueItem, 0);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        }
        android.view.VelocityTracker velocityTracker = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        }
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.RemoteActionCompatParcelizer.getLeft();
        int top = this.RemoteActionCompatParcelizer.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.ResultReceiver;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            write(0);
            return false;
        }
        View view = this.RemoteActionCompatParcelizer;
        int i7 = (int) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i8 = (int) this.PlaybackStateCompat;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        FocusTargetNodeKt focusTargetNodeKt = this.read;
        overScroller.startScroll(left, top, i5, i6, (int) ((write(i6, i4, focusTargetNodeKt.RemoteActionCompatParcelizer()) * f6) + (write(i5, i3, focusTargetNodeKt.write(view)) * f5)));
        write(2);
        return true;
    }

    public final View write(int i, int i2) {
        ViewGroup viewGroup = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            this.read.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void write(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.removeCallbacks(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        if (this.MediaBrowserCompatMediaItem != i) {
            this.MediaBrowserCompatMediaItem = i;
            this.read.read(i);
            if (this.MediaBrowserCompatMediaItem == 0) {
                this.RemoteActionCompatParcelizer = null;
            }
        }
    }

    public final boolean read(int i, int i2, View view) {
        this.RemoteActionCompatParcelizer = view;
        this.serializer = -1;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, i2, 0, 0);
        if (!zRemoteActionCompatParcelizer && this.MediaBrowserCompatMediaItem == 0 && this.RemoteActionCompatParcelizer != null) {
            this.RemoteActionCompatParcelizer = null;
        }
        return zRemoteActionCompatParcelizer;
    }

    public clearChildFocusdefault(Context context, ViewGroup viewGroup, FocusTargetNodeKt focusTargetNodeKt) {
        if (viewGroup == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Parent view may not be null");
            throw null;
        }
        if (focusTargetNodeKt == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Callback may not be null");
            throw null;
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = viewGroup;
        this.read = focusTargetNodeKt;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.write = i;
        this.RatingCompat = i;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = viewConfiguration.getScaledTouchSlop();
        this.PlaybackStateCompat = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ResultReceiver = new OverScroller(context, IconCompatParcelizer);
    }

    public final boolean RemoteActionCompatParcelizer(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.MediaMetadataCompat[i] & i2) != i2 || (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg & i2) == 0 || (this.MediaSessionCompatQueueItem[i] & i2) == i2 || (this.MediaDescriptionCompat[i] & i2) == i2) {
            return false;
        }
        float f3 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (fAbs <= f3 && fAbs2 <= f3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.read.getClass();
        }
        return (this.MediaDescriptionCompat[i] & i2) == 0 && fAbs > ((float) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2) {
        if (this.ComponentActivity) {
            return RemoteActionCompatParcelizer(i, i2, (int) this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getXVelocity(this.serializer), (int) this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getYVelocity(this.serializer));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    public final void read() {
        android.view.VelocityTracker velocityTracker = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        float f = this.PlaybackStateCompat;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getXVelocity(this.serializer);
        float f2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.getYVelocity(this.serializer);
        float f3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.ComponentActivity = true;
        this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer, xVelocity, f);
        this.ComponentActivity = false;
        if (this.MediaBrowserCompatMediaItem == 1) {
            write(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    public final boolean read(MotionEvent motionEvent) {
        View viewWrite;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            serializer();
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = android.view.VelocityTracker.obtain();
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.addMovement(motionEvent);
        FocusTargetNodeKt focusTargetNodeKt = this.read;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            IconCompatParcelizer(x, y, pointerId);
            View viewWrite2 = write((int) x, (int) y);
            if (viewWrite2 == this.RemoteActionCompatParcelizer && this.MediaBrowserCompatMediaItem == 2) {
                RemoteActionCompatParcelizer(pointerId, viewWrite2);
            }
            if ((this.MediaMetadataCompat[pointerId] & this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != 0) {
                focusTargetNodeKt.IconCompatParcelizer();
            }
        } else if (actionMasked == 1) {
            serializer();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                serializer();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                IconCompatParcelizer(x2, y2, pointerId2);
                int i = this.MediaBrowserCompatMediaItem;
                if (i == 0) {
                    if ((this.MediaMetadataCompat[pointerId2] & this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != 0) {
                        focusTargetNodeKt.IconCompatParcelizer();
                    }
                } else if (i == 2 && (viewWrite = write((int) x2, (int) y2)) == this.RemoteActionCompatParcelizer) {
                    RemoteActionCompatParcelizer(pointerId2, viewWrite);
                }
            } else if (actionMasked == 6) {
                serializer(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.ParcelableVolumeInfo != null && this.PlaybackStateCompatCustomAction != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId3 = motionEvent.getPointerId(i2);
                if (read(pointerId3)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.ParcelableVolumeInfo[pointerId3];
                    float f2 = y3 - this.PlaybackStateCompatCustomAction[pointerId3];
                    View viewWrite3 = write((int) x3, (int) y3);
                    boolean z = viewWrite3 != null && write(viewWrite3, f, f2);
                    if (z) {
                        int left = viewWrite3.getLeft();
                        int iSerializer = focusTargetNodeKt.serializer(((int) f) + left, viewWrite3);
                        int top = viewWrite3.getTop();
                        int iWrite = focusTargetNodeKt.write(((int) f2) + top, viewWrite3);
                        int iWrite2 = focusTargetNodeKt.write(viewWrite3);
                        int iRemoteActionCompatParcelizer = focusTargetNodeKt.RemoteActionCompatParcelizer();
                        if ((iWrite2 == 0 || (iWrite2 > 0 && iSerializer == left)) && (iRemoteActionCompatParcelizer == 0 || (iRemoteActionCompatParcelizer > 0 && iWrite == top))) {
                            break;
                        }
                        RemoteActionCompatParcelizer(f, f2, pointerId3);
                        if (this.MediaBrowserCompatMediaItem != 1 || (z && RemoteActionCompatParcelizer(pointerId3, viewWrite3))) {
                            break;
                        }
                    } else {
                        RemoteActionCompatParcelizer(f, f2, pointerId3);
                        if (this.MediaBrowserCompatMediaItem != 1) {
                            break;
                        }
                    }
                }
            }
            RemoteActionCompatParcelizer(motionEvent);
        }
        return this.MediaBrowserCompatMediaItem == 1;
    }

    public final void serializer(int i) {
        float[] fArr = this.ParcelableVolumeInfo;
        if (fArr != null) {
            int i2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.PlaybackStateCompatCustomAction[i] = 0.0f;
                this.MediaSessionCompatToken[i] = 0.0f;
                this.MediaSessionCompatResultReceiverWrapper[i] = 0.0f;
                this.MediaMetadataCompat[i] = 0;
                this.MediaDescriptionCompat[i] = 0;
                this.MediaSessionCompatQueueItem[i] = 0;
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (~i3) & i2;
            }
        }
    }

    public final void serializer(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            serializer();
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = android.view.VelocityTracker.obtain();
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.addMovement(motionEvent);
        FocusTargetNodeKt focusTargetNodeKt = this.read;
        int i = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewWrite = write((int) x, (int) y);
            IconCompatParcelizer(x, y, pointerId);
            RemoteActionCompatParcelizer(pointerId, viewWrite);
            if ((this.MediaMetadataCompat[pointerId] & this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != 0) {
                focusTargetNodeKt.IconCompatParcelizer();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.MediaBrowserCompatMediaItem == 1) {
                read();
            }
            serializer();
            return;
        }
        if (actionMasked == 2) {
            if (this.MediaBrowserCompatMediaItem != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i);
                    if (read(pointerId2)) {
                        float x2 = motionEvent.getX(i);
                        float y2 = motionEvent.getY(i);
                        float f = x2 - this.ParcelableVolumeInfo[pointerId2];
                        float f2 = y2 - this.PlaybackStateCompatCustomAction[pointerId2];
                        RemoteActionCompatParcelizer(f, f2, pointerId2);
                        if (this.MediaBrowserCompatMediaItem != 1) {
                            View viewWrite2 = write((int) x2, (int) y2);
                            if (write(viewWrite2, f, f2) && RemoteActionCompatParcelizer(pointerId2, viewWrite2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i++;
                }
                RemoteActionCompatParcelizer(motionEvent);
                return;
            }
            if (read(this.serializer)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.serializer);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.MediaSessionCompatToken;
                int i2 = this.serializer;
                int i3 = (int) (x3 - fArr[i2]);
                int i4 = (int) (y3 - this.MediaSessionCompatResultReceiverWrapper[i2]);
                int left = this.RemoteActionCompatParcelizer.getLeft() + i3;
                int top = this.RemoteActionCompatParcelizer.getTop() + i4;
                int left2 = this.RemoteActionCompatParcelizer.getLeft();
                int top2 = this.RemoteActionCompatParcelizer.getTop();
                if (i3 != 0) {
                    left = focusTargetNodeKt.serializer(left, this.RemoteActionCompatParcelizer);
                    View view = this.RemoteActionCompatParcelizer;
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    view.offsetLeftAndRight(left - left2);
                }
                if (i4 != 0) {
                    top = focusTargetNodeKt.write(top, this.RemoteActionCompatParcelizer);
                    View view2 = this.RemoteActionCompatParcelizer;
                    WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                    view2.offsetTopAndBottom(top - top2);
                }
                if (i3 != 0 || i4 != 0) {
                    focusTargetNodeKt.write(left, top, this.RemoteActionCompatParcelizer);
                }
                RemoteActionCompatParcelizer(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.MediaBrowserCompatMediaItem == 1) {
                this.ComponentActivity = true;
                focusTargetNodeKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 0.0f, 0.0f);
                this.ComponentActivity = false;
                if (this.MediaBrowserCompatMediaItem == 1) {
                    write(0);
                }
            }
            serializer();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.MediaBrowserCompatMediaItem == 1 && pointerId3 == this.serializer) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.serializer) {
                        View viewWrite3 = write((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view3 = this.RemoteActionCompatParcelizer;
                        if (viewWrite3 == view3 && RemoteActionCompatParcelizer(pointerId4, view3)) {
                            if (this.serializer == -1) {
                                break;
                            }
                        }
                    }
                    i++;
                }
                read();
            }
            serializer(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x4 = motionEvent.getX(actionIndex);
        float y4 = motionEvent.getY(actionIndex);
        IconCompatParcelizer(x4, y4, pointerId5);
        if (this.MediaBrowserCompatMediaItem == 0) {
            RemoteActionCompatParcelizer(pointerId5, write((int) x4, (int) y4));
            if ((this.MediaMetadataCompat[pointerId5] & this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) != 0) {
                focusTargetNodeKt.IconCompatParcelizer();
                return;
            }
            return;
        }
        int i5 = (int) x4;
        int i6 = (int) y4;
        View view4 = this.RemoteActionCompatParcelizer;
        if (view4 != null && i5 >= view4.getLeft() && i5 < view4.getRight() && i6 >= view4.getTop() && i6 < view4.getBottom()) {
            RemoteActionCompatParcelizer(pointerId5, this.RemoteActionCompatParcelizer);
        }
    }

    public final int write(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getWidth();
        float f = width / 2;
        float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(((fSin * f) + f) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    public final void write(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (parent != viewGroup) {
            DrawableTransformation.IconCompatParcelizer("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup, ")");
            return;
        }
        this.RemoteActionCompatParcelizer = view;
        this.serializer = i;
        this.read.read(i, view);
        write(1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean write(View view, float f, float f2) {
        if (view != null) {
            FocusTargetNodeKt focusTargetNodeKt = this.read;
            boolean z = focusTargetNodeKt.write(view) > 0;
            boolean z2 = focusTargetNodeKt.RemoteActionCompatParcelizer() > 0;
            if (z && z2) {
                int i = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if ((f2 * f2) + (f * f) > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) : Math.abs(f) > this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                return true;
            }
        }
        return false;
    }

    public final void IconCompatParcelizer(float f, float f2, int i) {
        float[] fArr = this.ParcelableVolumeInfo;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.PlaybackStateCompatCustomAction;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.MediaSessionCompatToken;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.MediaSessionCompatResultReceiverWrapper;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.MediaMetadataCompat;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.MediaDescriptionCompat;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.MediaSessionCompatQueueItem;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.ParcelableVolumeInfo = fArr2;
            this.PlaybackStateCompatCustomAction = fArr3;
            this.MediaSessionCompatToken = fArr4;
            this.MediaSessionCompatResultReceiverWrapper = fArr5;
            this.MediaMetadataCompat = iArr;
            this.MediaDescriptionCompat = iArr2;
            this.MediaSessionCompatQueueItem = iArr3;
        }
        float[] fArr9 = this.ParcelableVolumeInfo;
        this.MediaSessionCompatToken[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.PlaybackStateCompatCustomAction;
        this.MediaSessionCompatResultReceiverWrapper[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.MediaMetadataCompat;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i5 = i3 < viewGroup.getLeft() + this.RatingCompat ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.RatingCompat) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.RatingCompat) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.RatingCompat) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY |= 1 << i;
    }

    public final boolean RemoteActionCompatParcelizer(int i, View view) {
        if (view == this.RemoteActionCompatParcelizer && this.serializer == i) {
            return true;
        }
        if (view == null || !this.read.IconCompatParcelizer(i, view)) {
            return false;
        }
        this.serializer = i;
        write(i, view);
        return true;
    }

    public final boolean write() {
        if (this.MediaBrowserCompatMediaItem == 2) {
            OverScroller overScroller = this.ResultReceiver;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.RemoteActionCompatParcelizer.getLeft();
            int top = currY - this.RemoteActionCompatParcelizer.getTop();
            if (left != 0) {
                View view = this.RemoteActionCompatParcelizer;
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.RemoteActionCompatParcelizer;
                WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.read.write(currX, currY, this.RemoteActionCompatParcelizer);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
            } else if (!zComputeScrollOffset) {
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.post(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        }
        return this.MediaBrowserCompatMediaItem == 2;
    }

    public final void RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (read(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.MediaSessionCompatToken[pointerId] = x;
                this.MediaSessionCompatResultReceiverWrapper[pointerId] = y;
            }
        }
    }

    public final boolean read(int i) {
        if ((this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY & (1 << i)) != 0) {
            return true;
        }
        SentryLogcatAdapter.serializer("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
