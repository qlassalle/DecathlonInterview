# How this repo works?

The repo contains both bad practices and code to implement. We're starting from a broken state and **this should be
shared with the candidate. We don't want the candidate to think that it's normal to have broken code at Decathlon.**
We want the candidate to fix in the first place the existing tests and then add new code to implement the required features.

**The tests to fix are easy on purpose, we want to set a comfortable atmosphere for the candidate**.

*We allow the candidate to use AI and internet.*

# Running the exercise

We ask the candidate to start by running the tests. Out of the 3 tests, 2 should fail. From there, we ask the candidate
to fix them. Ask them to fix first the failing test (yellow) and then the one with the `NotImplementedException` (red).
For intermediate and senior candidates, this is expected to be done in a breeze.

The code contains obvious design flaws, such as returning null, mutable lists, high coupling, using floats for prices,
etc. These are meant to be starting conversation points for candidates, allowing them to show their knowledge.

#### Asking the candidate to evaluate him/herself?

In the last 5 minutes, we can ask the candidate to evaluate his or her work. It can be a good way to end, allowing us to
see if the candidate is self-aware, offers possible improvements, what he or she would have done with more time, etc.

### Junior candidates

For junior candidates, we want to assess them on the getMostExpensiveProducts function. The backbone of the test is
already there, they now need to create the logic.
Now that we have a sane state, we can have a discussion about the existing code, the design choices, how to fix it,
what she or he would change, etc.
We can then ask the candidate to create a way to manage discounts for our products. See the question bank if necessary.
If the candidate performs well, we can move on to the intermediate exercises if we have time.

### Intermediate candidates

For intermediate candidates, we still ask them to solve the getMostExpensiveProducts function, as this should be cleared
really fast. From there, we can move on to the `sendProductToEcommerceAndStockTeam` method. This should lead
to interesting questions about design, coupling, and testing. We'll ask the candidate if he or she sees any issue
about the current code, and how to fix it. We then ask the candidate to create fake adapters that would act as a message
queue.

### Senior candidates

For senior candidates, we can let them fix the tests first and implement the getMostExpensiveProducts exercise. 
We can immediately start talking about the design flaws in the existing code, without hints or orientating the 
conversation.
It's interesting to see what the candidate picks up as mandatory to change, and what she or he could live with.
This should be a few minutes, like 5 to 10 minutes depending on the points that are being picked up by the candidate.
From there, we can move on to implementing the `sendProductToEcommerceAndStockTeam` method.

If the candidate goes really fast, we can start talking about implementing an undo/redo feature for product edition.

# Questions Bank

> These questions can be helpful if you're looking for talking points. They are not mandatory, and it's not expected
> to ask all of them to the candidate.

Having questions for the juniors is the easiest. 

For intermediates, we expect them to see issues but not expect them to know how to solve all of them. We can guide them towards 
the issues and the solution.

For seniors, we expect them to raise the issues and propose a mitigation solution/a fix/another way of doing the request.

#### Junior 
- What do you think of the getById method? For example:
  - look for complexity (use a Map to have a 0(1) retrieval)
  - what about its signature? Maybe we can stop returning null and return an Optional?

- topK question:
  - algorithmic complexity (space & time)
  - what about using a heap?
  - what happens if K is invalid?
  - Use an immutable list?
  - How should we handle ties in price?

- Discounts question
  - What about products that don't have a discount?
  - How can we support many discounts?
  - What type for the newly calculated price?

#### Intermediate
Same as junior questions + 
- Should raise the coupling in the `sendToEcommerceAndStockTeam` method
- should know about dependency injection and why we should use it

## Senior
Same as junior and intermediate questions +
- how can we guarantee the correct execution of `sendToEcommerceAndStockTeam`?
- how would you go around testing that method?
  - Think unit tests and integration tests
- For `Product`, what about the price type?
