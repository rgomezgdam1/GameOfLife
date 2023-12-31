/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package lastsession

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LibraryTest {
    @Test fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }

    @Test fun emptyBoard() {
        val board = emptyBoardOfSize(5)
        board.printState()
        assertEquals(board, board.nextState())
    }




}
