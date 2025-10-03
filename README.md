# How this repo works?

`main` branch currently contains code for all levels. It contains information about the talking points we can have
with the candidate. Maybe this can be moved to a branch with all the solution for all exercises + the talking points

The repo contains both bad practices and code to implement. We're starting from a broken state and **this should be
shared with the candidate. We don't want the candidate to think that it's normal to have broken code at Decathlon.** 
We want him to fix in the first place the existing tests and then add new code to implement the required features.

We allow the candidate to use AI and internet.

# Running the exercise

We ask the candidate to start by running the tests. Out of the 3 tests, 2 should fail. From there, we ask the candidate
to fix them. For intermediate and senior candidates, this should be done in a breeze, and we can even think about
removing this part for senior candidates as it is really easy (this means removing the top K exercise for seniors).

The code contains obvious design flaws, such as returning null, mutable lists, high coupling, using floats for prices,
etc. These are meant to be starting conversation points for candidates, allowing them to show their knowledge.

#### Asking the candidate to evaluate him/herself?

In the last 5 minutes, we can ask the candidate to evaluate his or her work. It can be a good way to end, allowing us to
see if the candidate is self-aware, offers possible improvements, what he or she would have done with more time, etc.

# Junior candidates

For junior candidates, we want to assess them on the topKMostExpensiveProducts function. The backbone of the test is
already there, they now need to create the code.
Now that we have a sane state, we can have a discussion about the existing code, the design choices, how to fix it, 
what she or he would change, etc.
We can then ask him or her to implement a method to get the average price of products in the catalog.
If the candidate performs well, we can move on to the intermediate exercises if we have time.

# Intermediate candidates

For intermediate candidates, we still ask them to solve the topKMostExpensiveProducts function, as this should be cleared
really fast. From there, we can move on to the `sendProductToEcommerceAndSendEmailToClient` method. This should lead
to interesting questions about design, coupling, and testing. We'll ask the candidate if he or she sees any issue
about the current code, and how to fix it. We then ask the candidate to create fake adapters that would act as a message
queue.
From there, we can move on to the undo/redo exercise if we have time.

# Senior candidates

For senior candidates, we can immediately start talking about the design flaws in the existing code, without hints or
orientating the conversation. 
It's interesting to see what the candidate picks up as mandatory to change, and what she or he could live with.
This should be a few minutes, like 5 to 10 minutes depending on the points that are being picked up by the candidate.
From there, we can move on to the undo/redo exercise.
