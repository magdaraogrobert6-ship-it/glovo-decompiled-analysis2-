package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class Rect0a9Yr6o extends minRadius {
    public RoundRectsniSvfs IconCompatParcelizer;
    public final boolean read;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rect0a9Yr6o(getInternalCanvasannotations getinternalcanvasannotations, boolean z) {
        super(getinternalcanvasannotations);
        getinternalcanvasannotations.getClass();
        this.read = z;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f3 A[Catch: RuntimeException -> 0x00fa, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fa, blocks: (B:72:0x00ed, B:74:0x00f3), top: B:85:0x00ed }] */
    public final RoundRectsniSvfs IconCompatParcelizer(Context context) {
        int enterAnim;
        RoundRectsniSvfs roundRectsniSvfs;
        Animator animatorLoadAnimator;
        int i;
        if (this.write) {
            return this.IconCompatParcelizer;
        }
        getInternalCanvasannotations getinternalcanvasannotations = this.RemoteActionCompatParcelizer;
        androidx.fragment.app.Fragment fragment = getinternalcanvasannotations.RemoteActionCompatParcelizer;
        boolean z = getinternalcanvasannotations.serializer == clipRectN_I0leg.VISIBLE;
        int nextTransition = fragment.getNextTransition();
        if (this.read) {
            enterAnim = z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        } else {
            enterAnim = z ? fragment.getEnterAnim() : fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        RoundRectsniSvfs roundRectsniSvfs2 = null;
        if (viewGroup != null && viewGroup.getTag(com.logistics.rider.glovo.R.id.visible_removing_fragment_view_tag) != null) {
            fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.setTag(com.logistics.rider.glovo.R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, enterAnim);
            if (animationOnCreateAnimation != null) {
                roundRectsniSvfs2 = new RoundRectsniSvfs(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    roundRectsniSvfs2 = new RoundRectsniSvfs(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            i = z ? com.logistics.rider.glovo.R.animator.fragment_open_enter : com.logistics.rider.glovo.R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            i = z ? com.logistics.rider.glovo.R.animator.fragment_close_enter : com.logistics.rider.glovo.R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            i = z ? RoundRectgG7oq9Y.read(context, android.R.attr.activityCloseEnterAnimation) : RoundRectgG7oq9Y.read(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            i = z ? com.logistics.rider.glovo.R.animator.fragment_fade_enter : com.logistics.rider.glovo.R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            i = -1;
                        } else {
                            i = z ? RoundRectgG7oq9Y.read(context, android.R.attr.activityOpenEnterAnimation) : RoundRectgG7oq9Y.read(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = i;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    roundRectsniSvfs = new RoundRectsniSvfs(animationLoadAnimation);
                                    roundRectsniSvfs2 = roundRectsniSvfs;
                                }
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        roundRectsniSvfs = new RoundRectsniSvfs(animatorLoadAnimator);
                                        roundRectsniSvfs2 = roundRectsniSvfs;
                                    }
                                } catch (RuntimeException e2) {
                                    if (zEquals) {
                                        throw e2;
                                    }
                                    Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        roundRectsniSvfs2 = new RoundRectsniSvfs(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                roundRectsniSvfs = new RoundRectsniSvfs(animatorLoadAnimator);
                                roundRectsniSvfs2 = roundRectsniSvfs;
                            }
                        }
                    }
                }
            }
        }
        this.IconCompatParcelizer = roundRectsniSvfs2;
        this.write = true;
        return roundRectsniSvfs2;
    }
}
