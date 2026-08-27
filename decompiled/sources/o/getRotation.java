package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class getRotation {
    public final String IconCompatParcelizer;
    public final isTintable RemoteActionCompatParcelizer;
    public boolean read;
    public final insertAt serializer;
    public setRotation write;

    public static long IconCompatParcelizer(long j, long j2) {
        if (j2 > 0) {
            return (long) ((j / j2) * 100.0f);
        }
        return 0L;
    }

    public static long write(long j, long j2) {
        if (j2 > 0) {
            return (long) ((j / j2) * 10000.0f);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final GroupComponentwrappedListener1 RemoteActionCompatParcelizer() {
        setRotation setrotation;
        String str;
        isTintable istintable;
        androidx.emoji2.text.EmojiProcessor emojiProcessor;
        androidx.emoji2.text.EmojiProcessor emojiProcessor2;
        if (this.read) {
            String str2 = this.IconCompatParcelizer;
            insertAt insertat = this.serializer;
            isTintable istintable2 = this.RemoteActionCompatParcelizer;
            insertat.getClass();
            istintable2.getClass();
            setRotation setrotationSerializer = insertat.MediaSessionCompatQueueItem.serializer(str2, istintable2);
            androidx.emoji2.text.EmojiProcessor emojiProcessor3 = insertat.MediaSessionCompatQueueItem;
            isTintable istintable3 = isTintable.EXCLUSIVE;
            androidx.emoji2.text.EmojiProcessor emojiProcessor4 = istintable2 == istintable3 ? (androidx.emoji2.text.EmojiProcessor) emojiProcessor3.read : (androidx.emoji2.text.EmojiProcessor) emojiProcessor3.IconCompatParcelizer;
            emojiProcessor4.getClass();
            synchronized (emojiProcessor4.serializer) {
                ((LinkedHashSet) emojiProcessor4.IconCompatParcelizer).remove(str2);
            }
            AtomicInteger atomicInteger = insertat.write;
            int iDecrementAndGet = atomicInteger.decrementAndGet();
            if (iDecrementAndGet >= 0) {
                if (iDecrementAndGet == 0) {
                }
                this.read = false;
                setrotation = this.write;
                if (setrotation != null) {
                    this.write = null;
                    long j = setrotationSerializer.read - setrotation.read;
                    long j2 = setrotationSerializer.IconCompatParcelizer - setrotation.IconCompatParcelizer;
                    long j3 = setrotationSerializer.serializer - setrotation.serializer;
                    long j4 = setrotationSerializer.write - setrotation.write;
                    GroupComponentwrappedListener1 groupComponentwrappedListener1 = new GroupComponentwrappedListener1(j, j2, IconCompatParcelizer(j2, j), write(j2, j), j4, IconCompatParcelizer(j4, j), write(j4, j), j3, IconCompatParcelizer(j3, j), write(j3, j));
                    str = this.IconCompatParcelizer;
                    insertAt insertat2 = this.serializer;
                    istintable = this.RemoteActionCompatParcelizer;
                    insertat2.getClass();
                    istintable.getClass();
                    emojiProcessor = insertat2.MediaSessionCompatQueueItem;
                    if (istintable == istintable3) {
                        emojiProcessor2 = (androidx.emoji2.text.EmojiProcessor) emojiProcessor.read;
                    } else {
                        emojiProcessor2 = (androidx.emoji2.text.EmojiProcessor) emojiProcessor.IconCompatParcelizer;
                    }
                    emojiProcessor2.getClass();
                    synchronized (emojiProcessor2.serializer) {
                        ((LinkedHashMap) emojiProcessor2.read).remove(str);
                        ((LinkedHashSet) emojiProcessor2.IconCompatParcelizer).remove(str);
                    }
                    return groupComponentwrappedListener1;
                }
            } else {
                atomicInteger.set(0);
            }
            insertat.IconCompatParcelizer.IconCompatParcelizer(false);
            this.read = false;
            setrotation = this.write;
            if (setrotation != null) {
                this.write = null;
                long j5 = setrotationSerializer.read - setrotation.read;
                long j6 = setrotationSerializer.IconCompatParcelizer - setrotation.IconCompatParcelizer;
                long j7 = setrotationSerializer.serializer - setrotation.serializer;
                long j8 = setrotationSerializer.write - setrotation.write;
                GroupComponentwrappedListener1 groupComponentwrappedListener2 = new GroupComponentwrappedListener1(j5, j6, IconCompatParcelizer(j6, j5), write(j6, j5), j8, IconCompatParcelizer(j8, j5), write(j8, j5), j7, IconCompatParcelizer(j7, j5), write(j7, j5));
                str = this.IconCompatParcelizer;
                insertAt insertat3 = this.serializer;
                istintable = this.RemoteActionCompatParcelizer;
                insertat3.getClass();
                istintable.getClass();
                emojiProcessor = insertat3.MediaSessionCompatQueueItem;
                if (istintable == istintable3) {
                    emojiProcessor2 = (androidx.emoji2.text.EmojiProcessor) emojiProcessor.read;
                } else {
                    emojiProcessor2 = (androidx.emoji2.text.EmojiProcessor) emojiProcessor.IconCompatParcelizer;
                }
                emojiProcessor2.getClass();
                synchronized (emojiProcessor2.serializer) {
                    ((LinkedHashMap) emojiProcessor2.read).remove(str);
                    ((LinkedHashSet) emojiProcessor2.IconCompatParcelizer).remove(str);
                    return groupComponentwrappedListener2;
                }
            }
        }
        return null;
    }

    public getRotation(insertAt insertat, String str, isTintable istintable) {
        insertat.getClass();
        istintable.getClass();
        this.serializer = insertat;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = istintable;
    }

    public final void read() {
        if (this.read) {
            return;
        }
        String str = this.IconCompatParcelizer;
        insertAt insertat = this.serializer;
        isTintable istintable = this.RemoteActionCompatParcelizer;
        insertat.getClass();
        istintable.getClass();
        if (insertat.write.incrementAndGet() == 1) {
            insertat.IconCompatParcelizer.IconCompatParcelizer(true);
        }
        androidx.emoji2.text.EmojiProcessor emojiProcessor = insertat.MediaSessionCompatQueueItem;
        androidx.emoji2.text.EmojiProcessor emojiProcessor2 = istintable == isTintable.EXCLUSIVE ? (androidx.emoji2.text.EmojiProcessor) emojiProcessor.read : (androidx.emoji2.text.EmojiProcessor) emojiProcessor.IconCompatParcelizer;
        emojiProcessor2.getClass();
        synchronized (emojiProcessor2.serializer) {
            ((LinkedHashSet) emojiProcessor2.IconCompatParcelizer).add(str);
        }
        this.write = insertat.MediaSessionCompatQueueItem.serializer(str, istintable);
        this.read = true;
    }
}
