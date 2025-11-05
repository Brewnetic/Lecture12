// ============================================
// LECTURE 12: Collections Framework & HashSet & ArrayBlockingQueue
// Social Media Live Stream System
// ============================================

// TODO: Import HashSet from java.util package
// HINT: HashSet is part of the Collections Framework
// SYNTAX: import java.util.HashSet;
// This allows us to store unique viewers without duplicates
import _________________;

// TODO: Import ArrayBlockingQueue from java.util.concurrent package
// HINT: ArrayBlockingQueue is part of concurrent collections for thread-safe queuing
// SYNTAX: import java.util.concurrent.ArrayBlockingQueue;
// This allows us to queue chat messages with a fixed capacity
import _________________;

// TODO: Import Scanner from java.util package
// HINT: Scanner is used for reading user input
// SYNTAX: import java.util.Scanner;
// This allows us to simulate stream interactions
import _________________;

public class Lecture12 {
    
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("   SOCIAL MEDIA LIVE STREAM SYSTEM");
        System.out.println("========================================\n");
        
        // ============================================
        // PART 1: Tracking Unique Viewers with HashSet
        // ============================================
        
        // HashSet is perfect for tracking unique viewers in a live stream
        // If a viewer refreshes their browser, they're still the same person
        // HashSet automatically prevents duplicates - we never count the same viewer twice!
        // Think of it like a VIP list at an exclusive event - each person can only be on it once
        
        // TODO: Create a HashSet<String> called activeViewers
        // HINT: Use the 'new' keyword to instantiate the collection
        // SYNTAX: HashSet<String> name = new HashSet<>();
        // <String> means we're storing viewer usernames (strings) in our set
        // HashSet<>() creates an empty set ready to track unique viewers
        HashSet<String> activeViewers = _________________;
        
        System.out.println("--- Stream Starting ---\n");
        
        // The .add() method adds viewers to the HashSet
        // If a viewer already exists, .add() ignores it and returns false
        // This is the magic of HashSet - automatic duplicate prevention!
        // Each .add() call either adds a new unique viewer or does nothing
        
        // TODO: Add "alex_gaming" to activeViewers using .add()
        // HINT: Use the .add() method
        // SYNTAX: collectionName.add(element);
        // This adds "alex_gaming" to the set if they're not already there
        activeViewers._________________("alex_gaming");
        
        // TODO: Add "luna_tech" to activeViewers
        // HINT: Same method as above, different viewer
        // This adds "luna_tech" to the set if they're not already there
        activeViewers._________________("luna_tech");
        
        // TODO: Add "stream_pro" to activeViewers
        // HINT: Same method as above, third viewer
        // This adds "stream_pro" to the set if they're not already there
        activeViewers._________________("stream_pro");
        
        // TODO: Add "alex_gaming" AGAIN to activeViewers (duplicate!)
        // HINT: Same .add() method - but what happens with a duplicate?
        // SYNTAX: collectionName.add(element);
        // This will return false because "alex_gaming" is already in the set
        // The .add() method's return value tells us if it was actually added
        boolean wasNewViewer = activeViewers._________________("alex_gaming");
        
        System.out.println("✓ Stream started! First viewers joined.\n");
        
        // Display current viewers
        System.out.println("--- Current Viewers in Stream ---");
        
        // TODO: Print the total number of unique viewers using .size()
        // HINT: .size() returns an integer count of unique viewers in the HashSet
        // SYNTAX: collectionName.size();
        // This tells us how many unique viewers are watching
        // Notice: Even though we tried to add "alex_gaming" twice, size should be 3 (not 4)!
        System.out.println("Unique viewers: " + activeViewers._________________());
        
        System.out.println("\nViewer List:");
        // Enhanced for-each loop to display each viewer
        // HashSet iteration order is unpredictable (not in insertion order like ArrayList)
        // But we can still loop through all unique viewers
        
        // TODO: Fill in the for-each loop
        // HINT: The loop variable should be the type of elements (String for viewer names)
        // HINT: We're iterating through the 'activeViewers' HashSet
        // SYNTAX: for (String viewerName : activeViewers)
        // The variable name will represent each viewer as we loop through
        int viewerNumber = 1;
        for (String _________________ : _________________) {
            // Print the current viewer
            System.out.println("  " + viewerNumber + ". " + viewer);
            viewerNumber++;
        }
        
        System.out.println();
        
        // ============================================
        // PART 2: Processing Chat Messages with ArrayBlockingQueue
        // ============================================
        
        // ArrayBlockingQueue is perfect for managing chat messages during a stream
        // Messages come in rapidly, but the host can only read them at a certain speed
        // ArrayBlockingQueue automatically coordinates this:
        // - If chat is overflowing, it limits how many messages (fixed capacity)
        // - The host reads messages one by one (first in, first out - FIFO)
        // Think of it like a mailbox - letters come in (producer), someone reads them (consumer)
        
        System.out.println("--- Starting Live Chat ---\n");
        
        // TODO: Create an ArrayBlockingQueue<String> with capacity 5 called chatQueue
        // HINT: Use the 'new' keyword to instantiate the collection
        // SYNTAX: ArrayBlockingQueue<String> name = new ArrayBlockingQueue<>(capacity);
        // <String> means we're storing chat messages (strings) in our queue
        // The capacity (5) means at most 5 messages can be in the queue at once
        // ArrayBlockingQueue<>(5) creates a queue with maximum 5 messages
        ArrayBlockingQueue<String> chatQueue = _________________;
        
        // The .offer() method adds messages to the END of the queue
        // Messages are processed in FIFO order (First In, First Out)
        // Each .offer() call either adds the message or returns false if queue is full
        // This is different from regular queues - it doesn't wait, just rejects if full
        
        // TODO: Add first chat message using .offer()
        // HINT: Use the .offer() method
        // SYNTAX: collectionName.offer(element);
        // This adds the message to the queue if there's space
        chatQueue._________________("@alex_gaming: This stream is awesome!");
        
        // TODO: Add second chat message
        // HINT: Same method as above, different message
        // This adds another message to the queue
        chatQueue._________________("@luna_tech: Love the content!");
        
        // TODO: Add third chat message
        // HINT: Same method as above, third message
        // This adds another message to the queue
        chatQueue._________________("@stream_pro: When's the next episode?");
        
        System.out.println("✓ First chat messages received!\n");
        
        // Display chat queue status
        System.out.println("--- Chat Queue Status ---");
        
        // TODO: Print total messages in queue using .size()
        // HINT: .size() returns an integer count of messages in the ArrayBlockingQueue
        // SYNTAX: collectionName.size();
        // This tells us how many messages are waiting to be read
        System.out.println("Messages in queue: " + chatQueue._________________());
        
        System.out.println("\nPending Messages:");
        // Enhanced for-each loop to display each message
        // ArrayBlockingQueue maintains FIFO order, so messages display in order
        
        // TODO: Fill in the for-each loop to display messages
        // HINT: The loop variable should be String for chat messages
        // HINT: We're iterating through the 'chatQueue' ArrayBlockingQueue
        // SYNTAX: for (String message : chatQueue)
        // The variable name will represent each message as we loop through
        int messageNum = 1;
        for (String _________________ : _________________) {
            // Print the current message
            System.out.println("  " + messageNum + ". " + message);
            messageNum++;
        }
        
        System.out.println();
        
        // ============================================
        // PART 3: Host Reading and Responding to Chat
        // ============================================
        
        // The stream host reads chat messages one by one from the queue
        // As each message is read (removed), the next message moves to the front
        // This is exactly what a queue does - FIFO processing
        
        System.out.println("--- Host Reading Chat ---");
        
        // The host reads and responds to a message
        System.out.print("Host: I'll respond to a chat message. Reveal it? (y/n): ");
        String readChat = scanner.nextLine().toLowerCase();
        
        if (readChat.equals("y")) {
            // TODO: Remove and process the first message using .poll()
            // HINT: .poll() removes and returns the first message from the queue
            // SYNTAX: collectionName.poll();
            // This removes the message from queue and lets us see it
            // .poll() returns null if the queue is empty
            String firstMessage = chatQueue._________________();
            
            if (firstMessage != null) {
                System.out.println("\n✓ Host reading: " + firstMessage);
                System.out.println("✓ Message removed from queue!\n");
            } else {
                // Queue is empty - no messages to read
                System.out.println("✓ No messages in queue!\n");
            }
        }
        
        // Show updated queue after host read a message
        System.out.println("--- Updated Chat Queue ---");
        
        // TODO: Print remaining messages count using .size()
        // HINT: .size() now reflects the new number of messages after removal
        // SYNTAX: Same as before - collectionName.size();
        // The size has decreased by 1 since we removed a message
        System.out.println("Messages remaining: " + chatQueue._________________());
        
        // Display remaining messages
        if (!chatQueue.isEmpty()) {
            System.out.println("\nRemaining Messages:");
            
            // Show remaining messages in queue
            int remainingNum = 1;
            // TODO: Fill in the for-each loop
            // HINT: The loop variable should be String for messages
            // HINT: We're iterating through the 'chatQueue'
            // SYNTAX: for (String message : chatQueue)
            for (String _________________ : _________________) {
                // Print the current remaining message
                System.out.println("  " + remainingNum + ". " + message);
                remainingNum++;
            }
        } else {
            // Queue is empty
            System.out.println("Chat queue is EMPTY!");
        }
        
        System.out.println("\n========================================");
        System.out.println("    Live Stream Session Complete!");
        System.out.println("========================================");
        System.out.println("Unique viewers who watched: " + activeViewers.size());
        System.out.println("Messages processed: " + (3 - chatQueue.size()));
        
        // Close the Scanner when done (good practice for resource management)
        scanner.close();
    }
}

// ============================================
// KEY HASHSET METHODS REFERENCE
// ============================================
/*
 * HashSet Methods Used in This Example:
 * 
 * .add(E element)           - Add unique element to set
 *                             Returns: boolean (true if new, false if duplicate)
 *                             Time: Very fast - O(1) average
 *                             Note: Automatically prevents duplicates!
 * 
 * .contains(E element)      - Check if element exists in set
 *                             Returns: boolean (true if found, false if not)
 *                             Time: Very fast - O(1) average
 * 
 * .size()                   - Get number of unique elements
 *                             Returns: int (count of elements)
 *                             Time: Very fast - O(1)
 * 
 * .remove(E element)        - Remove specific element
 *                             Returns: boolean (true if found and removed)
 *                             Time: Very fast - O(1) average
 * 
 * .isEmpty()                - Check if set is empty
 *                             Returns: boolean (true if size is 0)
 *                             Time: Very fast - O(1)
 * 
 * Why HashSet for Live Stream Viewers?
 * ✓ Automatically prevents counting same viewer twice (duplicate prevention!)
 * ✓ Very fast lookup - can check "is this viewer already watching?" instantly
 * ✓ Efficient for frequently changing membership (viewers join/leave/rejoin)
 * ✓ No order needed - we just care about UNIQUE viewers, not order they joined
 * 
 * HashSet Key Concept:
 * - UNIQUE DATA - Each element can only appear once
 * - NO DUPLICATES - Trying to add duplicate returns false and does nothing
 * - NO ORDERING - Elements stored in random order (unlike ArrayList)
 * - FAST OPERATIONS - Add/remove/check all run in constant time O(1)
 * 
 * Real-World Uses of HashSet:
 * - Live stream unique viewer tracking (this example!)
 * - Social media unique followers (prevent double-counting)
 * - Email contact lists (no duplicate emails)
 * - Server unique IP addresses (each IP counted once)
 * - Game achievements (each achievement earned only once)
 * - Dictionary of unique words (spell checker)
 */


// ============================================
// KEY ARRAYBLOCKINGQUEUE METHODS REFERENCE
// ============================================
/*
 * ArrayBlockingQueue Methods Used in This Example:
 * 
 * .offer(E element)         - Add element to queue (end)
 *                             Returns: boolean (true if added, false if queue full)
 *                             Time: Very fast - O(1)
 *                             Note: Does NOT wait - just rejects if full
 * 
 * .poll()                   - Remove and return first element
 *                             Returns: Element if available, null if queue empty
 *                             Time: Very fast - O(1)
 *                             Note: FIFO order - first in, first out
 * 
 * .peek()                   - View first element without removing
 *                             Returns: Element if available, null if queue empty
 *                             Time: Very fast - O(1)
 *                             Note: Useful for checking next item without removing
 * 
 * .size()                   - Get number of elements currently in queue
 *                             Returns: int (current count, not capacity)
 *                             Time: Very fast - O(1)
 * 
 * .isEmpty()                - Check if queue is empty
 *                             Returns: boolean (true if size is 0)
 *                             Time: Very fast - O(1)
 * 
 * Why ArrayBlockingQueue for Chat Messages?
 * ✓ Fixed capacity prevents memory overflow (max 5 messages won't crash system)
 * ✓ FIFO ordering - messages read in exact order they arrived
 * ✓ Thread-safe for real streaming systems (multiple threads safely add/read)
 * ✓ Coordination - producer (chat) and consumer (host reading) work together
 * ✓ Fair processing - no message skipped or prioritized unfairly
 * 
 * ArrayBlockingQueue Key Concept:
 * - QUEUE BEHAVIOR - First In, First Out (FIFO)
 * - FIXED CAPACITY - Set when created, doesn't grow (prevents overflow)
 * - THREAD-SAFE - Multiple threads can safely add/remove simultaneously
 * - BLOCKING - Can wait (with timeout) if full (offer returns false instead)
 * 
 * Real-World Uses of ArrayBlockingQueue:
 * - Live chat message processing (this example!)
 * - Server request handling with limited worker threads
 * - Game server player action queue (process actions in order)
 * - Email queue system (limited batch processing)
 * - Print job queue (manage printing in order)
 * 
 * IMPORTANT DISTINCTION:
 * - .offer() returns boolean - doesn't wait if full
 * - .put() would wait (blocking) - but we're not using it in this example
 * - For this introductory class, .offer() is simpler to understand
 */


// ============================================
// HASHSET vs ARRAYBLOCKINGQUEUE COMPARISON
// ============================================
/*
 * Both are Collections Framework classes but serve different purposes:
 * 
 * HashSet:                          ArrayBlockingQueue:
 * - Purpose: Unique values         - Purpose: Ordered processing queue
 * - Order: Random/unordered        - Order: FIFO (First In, First Out)
 * - Duplicates: Prevented          - Duplicates: Allowed
 * - Capacity: Unlimited            - Capacity: Fixed at creation
 * - Best for: Membership tracking  - Best for: Message/task processing
 * - Thread-safe: No (single-thread)- Thread-safe: Yes (multi-thread)
 * 
 * When to use HashSet:
 * - Need unique/distinct items
 * - Order doesn't matter
 * - Fast lookup/duplicate check important
 * - Single-threaded application
 * 
 * When to use ArrayBlockingQueue:
 * - Need FIFO processing (tasks/messages)
 * - Want to limit capacity (prevent overflow)
 * - Multiple threads need safe coordination
 * - Order of processing matters
 */