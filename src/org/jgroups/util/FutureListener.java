package org.jgroups.util;

import java.util.concurrent.Future;

/**
 * A listener that is called back when a future is done.  FutureListener instances are attached to {@link
 * NotifyingFuture}s by passing them in to {@link NotifyingFuture#setListener(FutureListener)}
 * <p/>
 * Note that the {@link #futureDone(Future)} callback is invoked when the future completes, regardless of how the future
 * completes (i.e., normally, due to an exception, or cancelled}.  As such, implementations should check the future
 * passed in by calling <tt>future.get()</tt>.
 *
 * @author Manik Surtani
 * @since 2.9
 */
public interface FutureListener<T> {
    void futureDone(Future<T> future);
}
