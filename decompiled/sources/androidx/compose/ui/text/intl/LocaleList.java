package androidx.compose.ui.text.intl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.displayInAppMessagelambda121;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleList implements Collection<Locale>, displayInAppMessagelambda121 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final LocaleList Empty = new LocaleList(instance_delegatelambda0.write);
    private final List<Locale> localeList;
    private final int size;

    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    public LocaleList(String str) {
        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList(listSerializer.size());
        int size = listSerializer.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) listSerializer.get(i)).toString());
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(new Locale((String) arrayList.get(i2)));
        }
        this(arrayList2);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.localeList.containsAll(collection);
    }

    public final Locale get(int i) {
        return this.localeList.get(i);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocaleList getEmpty() {
            return LocaleList.Empty;
        }

        private Companion() {
        }

        public final LocaleList getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocaleList)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.localeList, ((LocaleList) obj).localeList}, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("LocaleList(localeList="), (List) this.localeList, ')');
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, tArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return contains((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Locale locale) {
        return this.localeList.contains(locale);
    }

    public LocaleList(List<Locale> list) {
        this.localeList = list;
        this.size = list.size();
    }

    public LocaleList(Locale... localeArr) {
        this((List<Locale>) onContentCardClicked.RatingCompat(localeArr));
    }
}
